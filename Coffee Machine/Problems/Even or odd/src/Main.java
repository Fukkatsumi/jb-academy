import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int input;
        for (;;) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                numbers.add(input);
            }
        }

        for (Integer integer : numbers) {
            System.out.println(integer % 2 == 0 ? "even" : "odd");
        }
    }
}