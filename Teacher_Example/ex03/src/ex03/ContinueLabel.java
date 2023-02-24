package ex03;
public class ContinueLabel {
	public static void main(String[] args) {
		Block: for (int y = 1; y <= 5; y++) {
			for (int x = 1; x <= 10; x++) {
				if (x > y) {
					System.out.println();
					continue Block;
				}
				System.out.print("*");
			}
		}
	}
}

