package polymorphismDemo2;


import java.util.Scanner;

interface Share {       //定義Share介面
   double area();        //宣告求面積area()方法
}

class Circle implements Share {    //Circle類別實作Share介面
   private double radius;     //半徑

   public Circle(double r) {
      this.radius = r;
   }

   public double area() {
      return 3.14 * radius * radius;
   }
}

class Tapezoid implements Share {      //Tapezoid類別實作Share介面
   private double uBase, dBase, high;  //上底,下底,高

   public Tapezoid(double u, double d, double h) {
      this.uBase = u;
      this.dBase = d;
      this.high = h;
   }

   public double area() {
      return (uBase + dBase) * high / 2;
   }
}

public class PolymorphismDemo2 {
   public static void main(String[] args) {
	   double radius, uBase, dBase, high;
	   Share sha;       //宣告Share類別的參考變數sha
	   Circle cir;      //宣告Circle類別的物件cir
	   //Tapezoid tap;    //宣告Tapezoid類別的物件tap
	   Scanner scn = new Scanner(System.in);    //建立scn物件接受輸入資料
	   while (true) {
	      System.out.print("請選擇形狀：(1.圓形   2.梯形    0.離開) ？ ");
	      int item = scn.nextInt();
	      if (item == 1) {
	         System.out.print("請輸入 半徑 ？ ");
	         radius = scn.nextDouble();
	         cir = new Circle(radius);
	         sha = cir;
	         System.out.print("圓形： 半徑  = " + radius);
	      } else if (item == 2) {
	         System.out.print("請輸入 上底 ？ ");
	         uBase = scn.nextDouble();
	         System.out.print("請輸入 下底 ？ ");
	         dBase = scn.nextDouble();
	         System.out.print("請輸入 高 ？ ");
	         high = scn.nextDouble();
	         sha = new Tapezoid(uBase, dBase, high);
	         System.out.print("梯形：上底 = " + uBase + "，下底 = " + dBase 
	                          + "，高 = " + high);
	      } else {
	         scn.close();
	         break;
	      }
	      //實作Share介面的area()方法
	      System.out.println("，面積為 " + sha.area());
	   }
   }
}
