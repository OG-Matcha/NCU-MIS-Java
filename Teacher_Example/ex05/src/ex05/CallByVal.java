package ex05;

public class CallByVal {
	public static void main(String[] args) {
		int a = 10, b = 15;
		System.out.println(" 傳值呼叫前\ta=" + a + "\tb=" + b );
		byVal(a, b);
		System.out.println(" 傳值呼叫後\ta=" + a + "\tb=" + b );
	}

	static void byVal(int x, int y) {
		int t; //以變數t作為暫存區，將引數互換
		t = x;
		x = y;
		y = t;
		System.out.println(" 傳值呼叫中\tx=" + x + "\ty=" + y );
	}
}

