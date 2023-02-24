package ex03;
public class NestFor {
	public static void main(String[] args) {
		for (int y = 1; y <= 4; y++) {
			for (int x = 1; x <= 16; x++) {
				System.out.print("*");
			}
			System.out.println();	  // 換行
		}
	}
}

