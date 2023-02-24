import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please input:");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();

        double sum = (num1 + num2 + num3);
        double avg = sum / 3;

        System.out.format("Average: %.2f", avg);

        scn.close();
    }
}