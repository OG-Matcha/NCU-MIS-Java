package ex05;

public class AddNums {
	public static void main(String[] args) {
		System.out.printf("%d%n", add());
		System.out.printf("%d%n", add(2, 4));
		System.out.printf("%d%n", add(1, 3, 5));
		System.out.printf("%d%n", add(2, 4, 6, 8));
	}
	static int add(int... a) {
		int sum = 0;
		for (int i : a)
			sum += i;
		return sum; // 傳回陣列a元素相加的結果
	}
}

