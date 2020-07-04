import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        boolean result;
        int input = 0;

        do {
            if (input != 0) {
                numbers.add(input);
            }
            input = scanner.nextInt();
        } while (input != 0);

        if (numbers.size() == 1) {
            result = true;
        } else {
            result = rightOrder(numbers);
        }
        System.out.println(result);
    }

    private static boolean rightOrder(List<Integer> numbers) {
        boolean checked = false;
        boolean flag = false;
        int prev = numbers.get(0);

        for (int number : numbers) {
            if (number != prev) {
                if (!checked) {
                    flag = number > prev;
                    checked = true;
                }
                if (flag && number >= prev) {
                    prev = number;
                } else if (!flag && number <= prev) {
                    prev = number;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}