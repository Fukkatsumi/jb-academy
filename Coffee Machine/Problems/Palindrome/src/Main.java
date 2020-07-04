import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        System.out.println(input.equals(new StringBuilder(input)
                .reverse()
                .toString()) ? "yes" : "no");
    }
}