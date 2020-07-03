import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (; start <= end; start++) {
            sum += start;
        }

        System.out.println(sum);
    }
}