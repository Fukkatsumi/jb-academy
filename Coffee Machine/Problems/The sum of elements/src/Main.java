import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        do {
            sum += input;
            input = scanner.nextInt();
        } while (input != 0);

        System.out.println(sum);
    }
}