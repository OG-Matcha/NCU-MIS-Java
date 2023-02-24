package ex02;
public class Ex02_13 {
	public static void main(String[] args) {
		int sum;
		float score1 = 60.5F;
		long score2 = 100;
		sum = (int) score1;		   // 資料型別強制轉換
		System.out.println("sum = " + sum); 
		sum = (int) (score1 + score2);	   // 資料型別強制轉換
		System.out.println("sum = " + sum);
	}
}

