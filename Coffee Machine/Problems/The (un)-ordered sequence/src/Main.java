import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int input = 0;
        int sum = 0;
        do {
            input = scanner.nextInt();
        } while (input != 0);

        System.out.println(sum);
    }
}