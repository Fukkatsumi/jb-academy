package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATER_IN_MACHINE = 400;
    private static final int MILK_IN_MACHINE = 540;
    private static final int BEANS_IN_MACHINE = 120;
    private static final int DISPOSABLE_CUPS = 9;
    private static final int MONEY_IN_MACHINE = 550;

    private static int water = WATER_IN_MACHINE;
    private static int milk = MILK_IN_MACHINE;
    private static int beans = BEANS_IN_MACHINE;
    private static int cups = DISPOSABLE_CUPS;
    private static int money = MONEY_IN_MACHINE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy":
                    buyCoffee(scanner);
                    break;
                case "fill":
                    fillMachine(scanner);
                    break;
                case "take":
                    takeMoney();
                    break;
                case "remaining":
                    displayMachineState();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static void calculate(int cupsOfCoffee) {
        water = WATER_IN_MACHINE * cupsOfCoffee;
        milk = MILK_IN_MACHINE * cupsOfCoffee;
        beans = BEANS_IN_MACHINE * cupsOfCoffee;
    }

    private static int calculateCupsOfCoffeeWithSpecifiedAmount(int water, int milk, int beans) {
        int minCups = 0;

        if (water != 0 && milk != 0 && beans != 0) {
            int waterCups = water / WATER_IN_MACHINE;
            int milkCups = milk / MILK_IN_MACHINE;
            int beansCups = beans / BEANS_IN_MACHINE;

            minCups = waterCups;

            if (milkCups < minCups) {
                minCups = milkCups;
            }

            if (beansCups < minCups) {
                minCups = beansCups;
            }
        }

        return minCups;
    }

    private static void displayMachineState() {
        String machineState = "\nThe coffee machine has:\n"
                + "%d of water\n"
                + "%d of milk\n"
                + "%d of coffee beans\n"
                + "%d of disposable cups\n"
                + "$%d of money\n";
        System.out.printf(machineState, water, milk, beans, cups, money);
    }

    private static void fillMachine(Scanner scanner) {
        System.out.println("Write how many ml of water do you want to add:");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans += scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups += scanner.nextInt();
    }

    private static void buyCoffee(Scanner scanner) {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        switch (scanner.next()) {
            case "1":
                makeCoffee(250, 0, 16, 4);
                break;
            case "2":
                makeCoffee(350, 75, 20, 7);
                break;
            case "3":
                makeCoffee(200, 100, 12, 6);
                break;
            default:
                break;
        }
    }

    private static void makeCoffee(int waterNeeds, int milkNeeds, int beansNeeds, int moneyNeeds) {
        if (water >= waterNeeds) {
            water -= waterNeeds;
        } else {
            displayError("water");
            return;
        }
        if (milk >= milkNeeds) {
            milk -= milkNeeds;
        } else {
            displayError("milk");
            return;
        }
        if (beans >= beansNeeds) {
            beans -= beansNeeds;
        } else {
            displayError("coffee beans");
            return;
        }
        if (cups >= 1) {
            cups--;
        } else {
            displayError("disposable cups");
            return;
        }
        System.out.println("I have enough resources, making you a coffee!");
        money += moneyNeeds;
    }

    private static void displayError(String text) {
        System.out.printf("Sorry, not enough %s!\n", text);
    }

    private static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
}
