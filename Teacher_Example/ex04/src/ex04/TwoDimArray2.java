package ex04;
public class TwoDimArray2 {
	public static void main(String[] args) {
		int[][] n = { { 0, 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };
		int sum = 0;
		for (int[] r : n) {
			for (int i :r) {
				sum += i;
			}
		}
		System.out.println(" n 陣列元素總和為 " + sum);
	}
}

