import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 0; i < students; i++) {
            int grades = scanner.nextInt();
            switch (grades) {
                case 2:
                    gradeD++;
                    break;
                case 3:
                    gradeC++;
                    break;
                case 4:
                    gradeB++;
                    break;
                case 5:
                    gradeA++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}