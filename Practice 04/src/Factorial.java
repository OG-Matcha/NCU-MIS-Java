import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Please enter one value: ");
            int num = scn.nextInt();

            if (num < 1 || num > 10) {
                System.out.println("Error, the value is out of range.");
                continue;
            }

            int res = 1;

            for (int j = 1; j <= num; j++) {
                res *= j;
            }

            System.out.printf("%d! : %d\n", num, res);

        }
        scn.close();
    }
}
