package ex02;
import java.util.Scanner;
public class Ex02_16 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入您的姓名：");
		String name = scn.nextLine(); // 讀入一行字串並指定給name字串變數
		System.out.printf("%s 您好!!%n", name);
		System.out.print("請輸入兩個整數，中間用空白間隔：");
		int num1 = scn.nextInt(); // 讀入一個整數並指定給age變數
		int num2 = scn.nextInt(); // 讀入一個整數並指定給age變數
		System.out.printf("%d + %d = %d%n", num1, num2, num1 + num2);
		scn.close();
	}
}

