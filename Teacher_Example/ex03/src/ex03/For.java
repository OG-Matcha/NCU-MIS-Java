package ex03;
public class For {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 10; i++) {
		    sum += i;
		}
		System.out.println("從1加到10的總和是: " + sum);
		System.out.println("最後 i 值為: " + i);	
	}
}

