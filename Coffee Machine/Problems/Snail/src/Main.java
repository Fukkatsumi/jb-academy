import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int stepsPerDay = scanner.nextInt();
        int stepsPerNight = scanner.nextInt();

        int day = 0;
        int steps = 0;

        while (true) {
            day++;
            steps += stepsPerDay;
            if (steps >= height) {
                System.out.println(day);
                return;
            } else {
                steps -= stepsPerNight;
            }
        }
    }
}