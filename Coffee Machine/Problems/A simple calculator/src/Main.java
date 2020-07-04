import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long first = scanner.nextLong();
        char operation = scanner.next().charAt(0);
        long second = scanner.nextLong();

        String output = "";

        switch (operation) {
            case '+':
                output = Long.toString(first + second);
                break;
            case '-':
                output = Long.toString(first - second);
                break;
            case '/':
                output = second == 0 ?
                        "Division by 0!" :
                        Long.toString(first / second);
                break;
            case '*':
                output = Long.toString(first * second);
                break;
            default:
                output = "Unknown operator";
                break;
        }

        System.out.println(output);
    }
}