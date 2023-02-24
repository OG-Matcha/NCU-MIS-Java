package ex05;

public class Method2 {
	public static void main(String[] args) {
		int n1 = 6, n2 = 9;
		int fac1, fac2;
		fac1 = factorial(n1);
		System.out.println(n1 + "! = " + fac1);
		fac2 = factorial(n2);
		System.out.println(n2 + "! = " + fac2);
	}

	static int factorial(int x) {
		int i = x, fac = 1;
		while(i > 0)
			fac *= i--;
		return fac;
	}
}

