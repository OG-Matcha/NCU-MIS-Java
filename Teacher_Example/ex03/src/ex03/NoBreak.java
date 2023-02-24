package ex03;
import java.util.Scanner;
public class NoBreak {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入1~3選擇種類:(1.敬老優待票 2.優待票 3.全票 )");
		String kind = scn.next();
		int money = 500;
		switch (kind) {
			case "1":
				money *= 0.7;
			case "2":
				money *= 0.8;
			default:
				System.out.printf("票價為： %d 元", money);
		}
		scn.close();
	}
}

