package ex02;
public class Ex02_08 {
	public static void main(String[] args) {
		int a=1,b=1,c=1;
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("a=b | a=c = " + (a==b | a==c));
		System.out.println("a=b || a=c = " + (a==b || a==c));
		System.out.println("a>b && a++>c = " + (a>b && a++>c));
		System.out.println("a = " + a + ", b = " + b );		
		System.out.println("a>b & a++>c = " + (a>b & a++>c));
		System.out.println("a = " + a + ", b = " + b );	
	}
}

