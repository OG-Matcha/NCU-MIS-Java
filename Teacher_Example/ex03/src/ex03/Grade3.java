package ex03;
import java.util.Scanner;
public class Grade3 {
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入考試分數: ");
		int score = scn.nextInt();
		
		char grade = switch(score / 10) {
		    case 10,9,8 -> '甲';
		    case 7 -> '乙';
		    case 6 -> '丙';	
		    default -> '丁'; 
	    };
		System.out.println(score + "分是屬於" + grade + "級的成績。");
		scn.close();
	}
}
