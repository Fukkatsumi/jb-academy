import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squirrelsCnt = scanner.nextInt();
        int nutsCnt = scanner.nextInt();

        scanner.close();

        System.out.println(nutsCnt % squirrelsCnt);
    }
}