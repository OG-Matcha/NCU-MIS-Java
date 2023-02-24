package ex03;
import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String id, pass;
		System.out.print("請輸入帳號: ");
		id = scn.next();
		System.out.print("請輸入密碼: ");
		pass = scn.next();
		if (id.equals("Love") & pass.equals("2520")) {
		    System.out.println("帳號密碼正確!!");
			System.out.println("歡迎進入本系統!!");
		} else {
			System.out.println("帳號密碼錯誤!!");
			System.out.println("無法進入本系統!!");
		}
		scn.close();
	}
}

