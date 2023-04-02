import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入學生人數: ");
        int numberOfStudents = scn.nextInt();

        float[] studentGrades = new float[numberOfStudents];
        float sumOfGrades = 0f;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("第%d個學生的成績: ", i + 1);
            studentGrades[i] = scn.nextFloat();
            sumOfGrades += studentGrades[i];
        }
        System.out.printf("人數: %d\n", numberOfStudents);
        System.out.printf("總分: %.2f\n", sumOfGrades);
        System.out.printf("總分: %f", sumOfGrades / numberOfStudents);

        scn.close();
    }
}
