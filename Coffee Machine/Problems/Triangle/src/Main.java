import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(triangleIsValid(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()) ? "YES" : "NO");
    }

    private static boolean triangleIsValid(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}