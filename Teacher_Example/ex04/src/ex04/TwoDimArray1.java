package ex04;
public class TwoDimArray1 {
	public static void main(String[] args) {
		int[][] n = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
		int sum = 0;
		for (int i = 0; i < n.length; i++) { // n.lenght會取得第一維陣列個數3
		   for(int j = 0; j < n[0].length; j++){//n[0].length取得第二維陣列個數4
		     System.out.print(" n[" + i + "][" + j + "] = " + n[i][j] + ", ");
		     sum += n[i][j];
		   }
		   System.out.println();     // 換行
		}
		System.out.println(" n 陣列元素總和為 " + sum);
	}
}

