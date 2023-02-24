package ex03;
import java.util.Scanner;
public class If {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入消費金額：");
		int money = scn.nextInt();    // 取得輸入的金額並轉成int資料型別
		if(money>1000) {			    // 如果金額大於1000時
		   money = 1000 + (int)((money - 1000) * 0.9);	//超出部分打九折
		}
		System.out.printf("實付金額：%d 元%n", money);
		scn.close();
	}
}

