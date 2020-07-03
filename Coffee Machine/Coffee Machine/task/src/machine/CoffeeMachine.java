package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATER_FOR_ONE_CUP = 200;
    private static final int MILK_FOR_ONE_CUP = 50;
    private static final int BEANS_FOR_ONE_CUP = 15;

    private static int water = WATER_FOR_ONE_CUP;
    private static int milk = MILK_FOR_ONE_CUP;
    private static int beans = BEANS_FOR_ONE_CUP;
    private static int cups = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        cups = scanner.nextInt();

        int calcCups = calculateCupsOfCoffeeWithSpecifiedAmount(water, milk, beans);

        if (cups == calcCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups > calcCups) {
            System.out.printf("No, I can make only %d cup(s) of coffee", calcCups);
        } else if (cups < calcCups) {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", calcCups - cups);
        }

    }

    private static void calculate(int cupsOfCoffee) {
        water = WATER_FOR_ONE_CUP * cupsOfCoffee;
        milk = MILK_FOR_ONE_CUP * cupsOfCoffee;
        beans = BEANS_FOR_ONE_CUP * cupsOfCoffee;
    }

    private static int calculateCupsOfCoffeeWithSpecifiedAmount(int water, int milk, int beans) {
        int minCups = 0;

        if (water != 0 && milk != 0 && beans != 0) {
            int waterCups = water / WATER_FOR_ONE_CUP;
            int milkCups = milk / MILK_FOR_ONE_CUP;
            int beansCups = beans / BEANS_FOR_ONE_CUP;

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
}
