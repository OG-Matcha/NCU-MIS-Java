package ex03;

public class Ex03_T07 {
	public static int pay(char grade) {
		int price = 0;
		switch (grade) {
			case 'A':
				price = 40;
				break;
			case 'T':
				price = 20;
			case 'C':
				price = 10;
				break;
			default:
				price = 80;
				break;
		}
		return price;
	}

	public static void main(String[] args) {
		System.out.println(pay('A'));
		System.out.println(pay('T'));
		System.out.println(pay('C'));
		System.out.println(pay('B'));
	}

}

