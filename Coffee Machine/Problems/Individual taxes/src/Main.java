import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int companiesCount = scanner.nextInt();

        int[] incomes = new int[companiesCount];
        int[] taxes = new int[companiesCount];
        double[] payment = new double[companiesCount];

        for (int i = 0; i < companiesCount; i++) {
            incomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < companiesCount; i++) {
            taxes[i] = scanner.nextInt();
        }

        double maxPayment = 0;
        int company = 0;
        for (int i = 0; i < companiesCount; i++) {
            payment[i] = incomes[i] / 100.0 * taxes[i];
            if (payment[i] > maxPayment) {
                maxPayment = payment[i];
                company = i;
            }
        }

        System.out.println(company + 1);
    }
}