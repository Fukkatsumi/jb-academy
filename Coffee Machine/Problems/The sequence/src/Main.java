import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int number = 1;
        int counter = 1;
        do {
            System.out.print(number + " ");
            counter--;
            if (counter == 0) {
                number++;
                counter = number;
            }
            input--;
        } while (input != 0);
    }
}