package ex03;
import java.util.Scanner;
public class ElseIfElse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入用水度數: ");
		int deg = scn.nextInt();   // 取得用水度數
		double unit;               // 每度單價
		if (deg <= 10) {           // 若度數小於等於10
			unit = 7.35;           // 每度7.35元
		} else if (deg > 10 && deg <= 30) {     // 若度數介於10~30
			unit = 9.45;           // 每度9.45元
		} else if (deg > 30 && deg <= 50) {     // 若度數介於30~50
			unit = 11.55;          // 每度11.55元
		} else {                   // 其餘即大於50度
			unit = 12.075;         // 每度12.075元
		}
		System.out.printf("每度：%6.3f 元%n", unit);
		System.out.printf("實付水費：%d 元", (int) (deg * unit));
		scn.close();
	}
}

