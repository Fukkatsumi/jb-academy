import java.util.Scanner;

class Main {
    public static final double GRAVITY = 9.8;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double density = scanner.nextDouble();
        double height = scanner.nextDouble();

        System.out.println(GRAVITY * density * height);
    }
}