package ex03;

public class EX03_T08 {
	public static void countDown(int start) {
	    for (int i =start;i>=0;--i) {
	      System.out.println(i);
	    }
	}

	public static void main(String[] args) {
		countDown(3);
		countDown(10);
	}

}

