package ex03;

public class Ex03_T04 {
	static String str = "";

	public static void main(String[] args) {
		str = str + 2;
		b: 
		for (int x = 3; x < 8; x++) {
			if (x == 4)
				break;
			if (x == 6)
				break b;
			str = str + x;
		}
		System.out.println(str);

	}

}

