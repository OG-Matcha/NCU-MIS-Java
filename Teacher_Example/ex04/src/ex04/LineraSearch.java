package ex04;
import java.util.Scanner;
public class LineraSearch {
	public static void main(String[] args) {
		int[] Adata = new int[] { 5, 3, 1, 2, 10, 9, 4, 8, 7, 6 };
		for (int i = 0; i < Adata.length; i++) {
			System.out.print("  第 " + (i + 1) + "個數=" + Adata[i]);
			if (i == 4 || i == 9)
				System.out.println();
		}
		Scanner scn = new Scanner(System.in);
		System.out.print(" 請輸入要搜尋的數字： ");
		int searchNum = scn.nextInt();
		int num = -1;                  // num等於-1表示沒有找到資料
		for (int j = 0; j < Adata.length; j++) {
			if (Adata[j] == searchNum) {
				num = j;
				break;
			}
		}
		System.out.println("================");
		if (num == -1)
			System.out.println(" 沒有這個數字--> " + searchNum);
		else
			System.out.println(" " +searchNum +"是第" + (num + 1)+ "個數。");
		scn.close();
	}
}

