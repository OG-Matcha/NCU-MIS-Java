package ex04;

public class Ex04_T04 {

	public static void main(String[] args) {
		int[][] score = new int[][]
		{    
			{90, 92, 95, 100},
			{100, 85, 0, 88},
			{65, 91, 45, 93},
		};
		System.out.print("score[1][2] = " +score[1][2] + "\n");
		score[1][2] = 45;
		System.out.print("score[1][2] = " +score[1][2]);
	}

}

