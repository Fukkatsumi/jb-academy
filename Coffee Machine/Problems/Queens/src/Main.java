import java.awt.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point q1 = new Point(scanner.nextInt(), scanner.nextInt());
        Point q2 = new Point(scanner.nextInt(), scanner.nextInt());
        System.out.println(Math.abs(q1.x - q2.x) == Math.abs(q1.y - q2.y)
                || q1.x == q2.x || q1.y == q2.y ? "YES" : "NO");
    }
}