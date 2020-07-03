import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextLong();
        int num = 0;
        while (fact(num) <= input) {
            num++;
        }

        System.out.println(num++);
    }

    private static long fact(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }
}