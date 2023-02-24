package ex04;
import java.util.Scanner;
public class Order {
	public static void main(String[] args) {
		String[][] menu = new String[3][];
		menu[0] = new String[] { "凱薩沙拉", "和風沙拉" };
		menu[1] = new String[] { "香煎雞腿", "經典牛排", "海陸雙拼" };
		menu[2] = new String[] { "綠茶", "咖啡", "柳橙汁", "冰醋" };
		int[] sel = new int[] { 0, 0, 0 };
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < menu.length; i++) { //menu.length表第一維陣列個數
			System.out.println("** 請選擇 **");
			for (int j = 0; j < menu[i].length; j++) {
				System.out.println(menu[i][j] + " ->輸入" + (j + 1));
			}
			sel[i] = scn.nextInt() - 1; // 輸入值-1表註標值
		}
		System.out.println("** 您選擇 **");
		System.out.printf("前菜：%s，主餐：%s，飲料：%s",
		               menu[0][sel[0]], menu[1][sel[1]], menu[2][sel[2]]);
		scn.close();
	}
}

