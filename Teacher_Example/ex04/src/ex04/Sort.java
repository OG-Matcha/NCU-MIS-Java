package ex04;
import java.util.Arrays;
public class Sort {
	public static void main(String[] args) {
		int[] num = new int[]{1,9,6,2,8,4};
		Arrays.sort(num);
		for(int n:num)
			System.out.print(n+", ");
	}
}

