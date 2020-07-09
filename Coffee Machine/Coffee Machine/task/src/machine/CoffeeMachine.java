package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final String[] FILL_MESSAGE = new String[]{
            "Write how many ml of water do you want to add:",
            "Write how many ml of milk do you want to add:",
            "Write how many grams of coffee beans do you want to add:",
            "Write how many disposable cups of coffee do you want to add:"
    };

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

    private static State state = State.ACTION;
    private static int fillIndex = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        while (true) {
            switch (state) {
                case ACTION:
                    selectAction();
                    break;
                case BUYING:
                    buyCoffee();
                    break;
                case FILLING:
                    fillMachine();
                    break;
                case TAKING:
                    takeMoney();
                    break;
                case REMAINING:
                    displayMachineState();
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static String read() {
        return scanner.nextLine();
    }

    public static void selectAction() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String data = read();
        switch (data) {
            case "buy":
                state = State.BUYING;
                break;
            case "fill":
                state = State.FILLING;
                break;
            case "take":
                state = State.TAKING;
                break;
            case "remaining":
                state = State.REMAINING;
                break;
            case "exit":
                state = State.EXIT;
                break;
            default:
                break;
        }
    }

    private static void displayMachineState() {
        String machineState = "\nThe coffee machine has:\n"
                + "%d of water\n"
                + "%d of milk\n"
                + "%d of coffee beans\n"
                + "%d of disposable cups\n"
                + "$%d of money\n";
        System.out.printf(machineState, water, milk, beans, cups, money);
        state = State.ACTION;
    }

    private static void fillMachine() {
        if (fillIndex >= 0 && fillIndex < 4) {
            System.out.println(FILL_MESSAGE[fillIndex]);
            String data = read();

            switch (fillIndex) {
                case 0:
                    water += Integer.parseInt(data);
                    break;
                case 1:
                    milk += Integer.parseInt(data);
                    break;
                case 2:
                    beans += Integer.parseInt(data);
                    break;
                case 3:
                    cups += Integer.parseInt(data);
                    break;
                default:

                    break;
            }
        } else {
            fillIndex = -1;
            state = State.ACTION;
        }
        fillIndex++;
    }

    private static void buyCoffee() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String data = read();
        switch (data) {
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

        state = State.ACTION;
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
        state = State.ACTION;
    }
}
