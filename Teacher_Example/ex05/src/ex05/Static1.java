package ex05;

public class Static1 {
	static void sub(int x, int y) { // 被呼叫方法主體
		System.out.print("呼叫Static1類別的sub方法-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
	public static void main(String[] args) {
		int a = 25;
		// 呼叫同一類別的sub方法
		sub(a - 5, 3); // 呼叫敘述
		// 呼叫不同類別的sub方法
		Static2.sub(a + 3, 5); // 呼叫敘述
	}
}

class Static2 {
	static void sub(int x, int y) { // 被呼叫方法主體
		System.out.print("呼叫Static2類別的sub方法-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
}

