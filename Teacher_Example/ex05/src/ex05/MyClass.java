package ex05;

public class MyClass {
	void sub(int x, int y) {
		System.out.print(" 呼叫MyClass類別的sub方法-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}

	public static void main(String[] args) {
		int a = 25;
		MyClass c1 = new MyClass(); // 建立屬於MyClass類別的物件c1
		c1.sub(a - 5, 3); // 呼叫物件c1的sub方法
		MyCal c2 = new MyCal(); // 建立屬於MyCal類別的物件c2
		c2.sub(a + 3, 5); // 呼叫物件c2的sub方法
	}
}

class MyCal {
	void sub(int x, int y) {
		System.out.print(" 呼叫MyCal  類別的sub方法-->");
		System.out.println(x + " - " + y + " = " + (x - y));
	}
}

