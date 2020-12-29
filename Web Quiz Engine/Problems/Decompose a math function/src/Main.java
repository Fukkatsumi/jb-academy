import java.util.Scanner;

class MultipleFunction {
    public static final double POWER = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        double result = 0;
        if (x >= 1) {
            result = f3(x);
        } else if (x > 0 && x < 1) {
            result = f2(x);
        } else if (x <= 0) {
            result = f1(x);
        }

        return result;
    }

    public static double f1(double x) {
        double result = 0;
        result = Math.pow(x, POWER) + 1;
        return result;
    }

    public static double f2(double x) {
        double result = 0;
        result = 1 / Math.pow(x, POWER);
        return result;
    }

    public static double f3(double x) {
        double result = 0;
        result = Math.pow(x, POWER) - 1;
        return result;
    }
}