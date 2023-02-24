package ex03;

public class Ex03_T02 {

	public static void main(String[] args) {
		String str = "";
		b: for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 2; y++) {
				if (x == 1)
					break;
				if (x == 2 && y == 1)
					break b;
				str = str + x + y;
			}
		}
		System.out.println(str);

	}

}

