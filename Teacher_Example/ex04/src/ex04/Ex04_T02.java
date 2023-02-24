package ex04;
import java.util.*;
public class Ex04_T02 {
	public static void main(String[] args) {
		String[] colors = { "blue","red","green","yellow","orange" };
		Arrays.sort(colors) ;
		int s2 = Arrays.binarySearch(colors, "orange") ;
		int s3 = Arrays.binarySearch(colors, "violet") ;
		System.out.print(s2 + " " + s3);
	}

}

