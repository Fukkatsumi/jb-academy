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

        int sequenceLength = 1;
        int length = 1;
        for (int i = 0; i < size - 1; i++) {
            if (numbers.get(i + 1) > numbers.get(i)) {
                length++;
            } else {
                length = 1;
            }
            sequenceLength = Math.max(sequenceLength, length);
        }
        System.out.println(sequenceLength);
    }
}