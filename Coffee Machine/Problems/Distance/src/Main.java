import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int time = scanner.nextInt();

        System.out.println((float) (distance / time));
    }
}