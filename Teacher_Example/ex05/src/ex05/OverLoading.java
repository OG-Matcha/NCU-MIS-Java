package ex05;

public class OverLoading {
	static int max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	static double max(double[] vArray) {
		double n = vArray[0];
		for (int i = 1; i < vArray.length - 1; i++) {
			if (vArray[i] > n)
				n = vArray[i];
		}
		return n;
	}

	public static void main(String[] args) {
		int a = 26, b = 37;
		System.out.println(a + "和" + b + "最大的數值為" + max(a, b));
		double f[] = new double[] { 2.1, 5.3, 7.2, 4.8 };
		System.out.println("陣列元素 [2.1,5.3,7.2,4.8] 中最大的數值為" +	max(f));
	}
}

