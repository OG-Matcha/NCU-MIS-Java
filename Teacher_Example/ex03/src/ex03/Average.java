package ex03;
import java.util.Scanner;
public class Average {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int score = 0;	// 輸入的分數預設為0
		int sum = 0;	// 累計的總和
		int num = 0;		   // 預設人數為0
		while (score != -1) {
			System.out.print("請輸入分數 (輸入-1結束):");
			score = scn.nextInt();	// 讀取分數
			if(score != -1) {
		    	sum += score;		// 將輸入分數的加到總和sum中
		    	num++;	// 人數加1        		
			}
		}
		System.out.printf("平均分數 = " + (double)((sum+1) / (num-1)));
		scn.close();
	}
}

