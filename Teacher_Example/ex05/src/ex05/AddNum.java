package ex05;

public class AddNum {
	public static void main(String[] args) {
		int total1, x=17, y=28;
		double total2, i=3.8, j=22.7, k=15.1;
		total1 = add(x, y);
		total2 = add(i, j, k);
		System.out.printf("%d%n",total1);
		System.out.printf("%f%n",total2);
	}
	static int add(int a, int b) {
		return a + b; // 傳回兩個整數相加的結果
	}
	static double add(double a, double b, double c) {
		return a + b + c; // 傳回三個倍精確度相加的結果
	}
}

