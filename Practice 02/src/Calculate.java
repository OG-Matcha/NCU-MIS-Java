import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        System.out.print("請輸入您的姓名: ");
        String name = scn.next();

        System.out.println("Hi, " + name + ", 請輸入您的銅板的個數: ");

        System.out.print("請輸入1元的數量: ");
        int one = scn.nextInt();
        System.out.print("請輸入5元的數量: ");
        int five = scn.nextInt();
        System.out.print("請輸入10元的數量: ");
        int ten = scn.nextInt();
        System.out.print("請輸入50元的數量: ");
        int fifty = scn.nextInt();

        int total = fifty * 50 + ten * 10 + five * 5 + one;

        int thou = total / 1000;
        int hund = total % 1000 / 100;
        int tens = total % 100 / 10;
        int ones = total % 10;

        System.out.format("您的錢總共有: %d 千 %d 百 %d 十 %d 元",
                thou, hund, tens, ones);

        scn.close();
    }
}