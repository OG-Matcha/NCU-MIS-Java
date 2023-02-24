package ex02;
public class Ex02_14 {
	public static void main(String[] args) {
		int[] a;
		a = new int[] { 1, 2, 3 };
		int[] n = a;
		System.out.println("a[0]=" + a[0] + "\ta[1]=" + a[1] + "\ta[2]=" + a[2]);
		System.out.println("n[0]=" + n[0] + "\tn[1]=" + n[1] + "\tn[2]=" + n[2]);
		n[1] = 15;
		System.out.println("-------------------------");
		System.out.println("a[0]=" + a[0] + "\ta[1]=" + a[1] + "\ta[2]=" + a[2]);
		System.out.println("n[0]=" + n[0] + "\tn[1]=" + n[1] + "\tn[2]=" + n[2]);
	}
}

