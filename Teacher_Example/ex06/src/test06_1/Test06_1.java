package test06_1;

class Test {
    int x = 12;
	public void method(int x) {
	    x += x;
	    System.out.println(x);
	}
}
 
public class Test06_1 {
	public static void main(String[] args) {
	    Test t = new Test();
		t.method(5);
	}
}

