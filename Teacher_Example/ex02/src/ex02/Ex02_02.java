package ex02;
public class Ex02_02 {
	public static void main(String[] args) {
		int money = 100_000;	    // 宣告money為整數變數，並指定初值
		double rate = .01;	           // 宣告rate為浮點數變數，並指定初值
		System.out.println("本金 " + money + " 元, 利率 " + rate +
							"，年利息為" + money * rate + "元");
	}
}

