package ex02;
import java.util.Scanner;
public class Ex02_04 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入資料：");
		var inputData = scn.next();
		System.out.println("您輸入的資料是 "+ inputData);
		scn.close();
	}
}

