import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().replace(" ", "");
        String string2 = scanner.nextLine().replace(" ", "");

        System.out.println(string.equals(string2));
    }
}