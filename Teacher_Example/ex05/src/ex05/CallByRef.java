package ex05;

class Obj {
	int a, b;

	Obj() {
		a = 10;
		b = 15;
	}
}

public class CallByRef {
	public static void main(String[] args) {
		Obj obj = new Obj();
		System.out.println(" 參考呼叫前\t a = " + obj.a + "\tb = " + obj.b);
		byRef(obj);
		System.out.println(" 參考呼叫後\t a = " + obj.a + "\tb = " + obj.b);
	}

	static void byRef(Obj p) {
		int t;
		t = p.a;
		p.a = p.b;
		p.b = t;
	}
}

