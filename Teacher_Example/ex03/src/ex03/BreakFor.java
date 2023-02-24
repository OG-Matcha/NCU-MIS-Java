package ex03;
import java.util.Scanner;
public class BreakFor {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入正整數：");
		int num= scn.nextInt();
		boolean prm = true;  	// 預設prm為true，表為質數
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				prm = false;      // 設prm為false，表不是質數
				break;	// 離開for迴圈
			}
		}
		if (prm == true) 
			System.out.printf("%d 是質數", num);
		else
			System.out.printf("%d 不是質數", num);
		scn.close();
	}
}

