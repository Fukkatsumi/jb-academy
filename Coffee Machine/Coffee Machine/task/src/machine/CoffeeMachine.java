package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final int WATER_FOR_ONE_CUP = 200;
    private static final int MILK_FOR_ONE_CUP = 50;
    private static final int BEANS_FOR_ONE_CUP = 15;

    private static int water = WATER_FOR_ONE_CUP;
    private static int milk = MILK_FOR_ONE_CUP;
    private static int beans = BEANS_FOR_ONE_CUP;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        calculate(cups);

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println( water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
    }

    private static void calculate(int cupsOfCoffee) {
        water = WATER_FOR_ONE_CUP * cupsOfCoffee;
        milk = MILK_FOR_ONE_CUP * cupsOfCoffee;
        beans = BEANS_FOR_ONE_CUP * cupsOfCoffee;
    }
}
