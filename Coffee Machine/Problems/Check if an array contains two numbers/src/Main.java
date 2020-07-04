import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            numbers.add(scanner.nextInt());
        }

        int one = scanner.nextInt();
        int two = scanner.nextInt();

        boolean result = false;
        if (numbers.contains(one) && numbers.contains(two)) {
            for (int i = 0; i < size - 1; i++) {
                if (numbers.get(i) == one && numbers.get(i + 1) == two
                        || numbers.get(i) == two && numbers.get(i + 1) == one) {
                    result = true;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}