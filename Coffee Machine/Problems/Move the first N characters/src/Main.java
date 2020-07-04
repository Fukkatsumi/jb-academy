import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        int index = scanner.nextInt();

        if (index > input.length()) {
            System.out.println(input);
        } else {
            System.out.println(input.substring(index) + input.substring(0, index));
        }
    }
}