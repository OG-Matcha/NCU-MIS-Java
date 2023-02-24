package ex05;

public class Method1 {
	public static void main(String[] args) {
		factorial(6);
		factorial(9);
	}

	static void factorial(int x) {
		int i = x, j = 1;
		while(i > 0)
			j *= i--;
		System.out.println(x + "! = " + j);
	}
}

