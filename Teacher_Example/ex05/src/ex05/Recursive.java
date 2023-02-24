package ex05;
public class Recursive {
	static int f (int n) {
		if (n == 1)
			return n;
		else
			return n + f(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("10 + 9 + ... + 2 + 1 = " + f(10));
		System.out.println("100 + 99 + ... + 2 + 1 = " + f(100));
	}
}

