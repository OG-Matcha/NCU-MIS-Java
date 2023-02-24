package ex02;
public class Ex02_11 {
	public static void main(String[] args) {
		int a = 16;
		System.out.println("a = 16, a << 1 = " + (a << 1));
		System.out.println("a = 16, a << 2 = " + (a << 2));
		System.out.println("a = 16, a >> 2 = " + (a >> 2));
		a = 35;
		System.out.println("a = 35, a >> 2 = " + (a >> 2));
		a = -16;
		a >>= 1;
		System.out.println("a = -8, a >> 2 = " + (a >> 2));
		System.out.println("a = -8, a << 2 = " + (a << 2));
	}
}

