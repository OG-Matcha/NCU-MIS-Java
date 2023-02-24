package ex04;
import java.util.Scanner;
public class BinarySearch {
	public static void main(String[] args) {
		int[] aNum = new int[9];
		for (int i = 0; i < aNum.length; i++)
			aNum[i]=(int)(Math.random()*100)+1;		
		System.out.print(" 排序前：");
		for (int a : aNum)	//使用加強型for迴圈讀取陣列元素值
			System.out.print("  " + a);
		System.out.println();
		int n = aNum.length;
		int t;

		for (int i = n - 2; i >= 0; i--) { // 進行氣泡排序法
			for (int j = 0; j <= i; j++) {
				if (aNum[j] > aNum[j + 1]) {
					 t = aNum[j];
					aNum[j] = aNum[j + 1];
					aNum[j + 1] = t;
				}
			}
		}
		System.out.print(" 排序後：");
		for (int a : aNum)
			System.out.print("  " + a);
		System.out.println();
		Scanner scn = new Scanner(System.in);
		System.out.print(" 請輸入要搜尋的數字： ");
		int sNum = scn.nextInt();
		int num = -1, low = 0, high = aNum.length - 1, midNum = 0;
		do {
			midNum = (low + high) / 2;
			if (aNum[midNum] == sNum) {  //若中間註標的陣列值和搜尋資料相同
				num = midNum;
				break;				//離開迴圈
			}
			if (aNum[midNum] > sNum)     //若中間註標的陣列值>搜尋資料
				high = midNum - 1;	//重設上界值
			else
				low = midNum + 1; 	//重設下界值
		} while (low <= high);		//若下界值 <= 上界值就繼續執行
		if (num == -1)
			System.out.println(" 沒有 " + sNum + " 這個數字! ");
		else
			System.out.println("排序後找到"+sNum+"是第"+(num +1)+ "個數字!");
		scn.close();
	}
}

