package ex04;
import java.util.Arrays;
import java.util.Scanner;
public class Search {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String[] aName = { "Jerry", "Jack", "Winnie", "Max", "Amy",
		                   "Peter", "Tony" };
		System.out.print("排序前: ");
		for (int i = 0; i < aName.length; i++)
			System.out.print(aName[i] + ", ");
		System.out.println();
		Arrays.sort(aName);
		System.out.print("排序後: ");
		for (int i = 0; i < aName.length; i++)
			System.out.print(aName[i] + ", ");
		System.out.println();
		System.out.print("請輸入搜尋值: ");
		String sName = scn.nextLine();
		int find = -1;
		if ((find = Arrays.binarySearch(aName, sName)) > -1) {
			System.out.println("找到 "+sName +"位於註標 " + find + " 處");
		} else
			System.out.println("找不到"+sName);
		scn.close();
	}
}

