import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int res = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 7 == 0) {
                continue;
            }
            if (i % 3 != 0 && i % 5 != 0) {
                continue;
            }

            res += i;
        }

        System.out.printf("Answer: %d", res);

        scn.close();
    }
}
