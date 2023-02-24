package ex03;
import java.util.Scanner;
public class NestIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.print("請輸入三個數字(空白區隔):");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		if (num1 > num2) {        // 用巢狀迴圈來判斷三個數字中，誰是最大數字
			if (num1 > num3)
				max = num1;
			else
				max = num3;
		} else {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}
		System.out.println("最大的數字是:" + max);
		scn.close();
	}
}

