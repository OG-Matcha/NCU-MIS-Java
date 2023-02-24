package ex03;
import java.util.Scanner;
public class Train {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入公里數:");
		int km = scn.nextInt();
		System.out.print("請輸入數字選擇車種(1-自強、2-莒光、3-復興/區間):");
		int kind = scn.nextInt();
		double unit;
		if(kind==1) {
			unit=2.27;
		} else if(kind==2) {
			unit=1.75;
		} else {
			unit=1.46;
		}
		System.out.print("請輸入數字選擇去回(1-單程、2-去回):");
		int back = scn.nextInt();
		double returnT = back == 1 ? 1 : 1.8;
		System.out.printf("票價: %4d 元%n", (int) (km * unit * returnT));
		scn.close();
	}
}

