package ex02;
import java.util.Scanner;
public class Ex02_T05 {
    public static String getDate(){
        System.out.print("請輸入到職日期(格式：MMDDYYYY)");
        Scanner sc = new Scanner(System.in);
        String startDate = sc.next();
        sc.close();
        return startDate;
    }

	public static void main(String[] args) {
        System.out.printf("到職日期= %s", getDate());
	}
}

