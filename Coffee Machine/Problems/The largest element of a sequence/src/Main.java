import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int max = 0;
        do {
            max = Math.max(input, max);
            input = scanner.nextInt();
        } while (input != 0);

        System.out.println(max);
    }
}