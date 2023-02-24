package ex02;
public class Ex02_15 {
	public static void main(String[] args) {
		String title = "價格：NT";
		int money = 128;
		double tax = money * 0.05;
		System.out.printf("%s%5d元, 稅金：%.1f元%n", title, money, tax);
	}
}

