import java.util.*;

public class Main {
    private static final int LENGTH = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[LENGTH][LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < LENGTH; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        boolean pretty = true;
        for (int i = 0; i < LENGTH - 1; i++) {
            for (int j = 0; j < LENGTH - 1; j++) {
                if (matrix[i][j] == matrix[i + 1][j]
                        && matrix[i][j] == matrix[i][j + 1]
                        && matrix[i][j] == matrix[i + 1][j + 1]) {
                    pretty = !pretty;
                    break;
                }
            }
        }

        System.out.println(pretty ? "YES" : "NO");
    }
}