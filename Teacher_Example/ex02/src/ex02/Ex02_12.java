package ex02;
public class Ex02_12 {
	public static void main(String[] args) {
		double total;
		int income = 10000;
		total = income;			// 資料型別自動轉換
		System.out.println("total = " + total);
		// income = total;     // 若加入此行，會產生編譯錯誤
	}
}

