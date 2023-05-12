package polymorphismDemo1;

import java.util.Scanner;

abstract class Share {                       // 抽象類別
   abstract double area(double X, double Y);  // 抽象方法
}

class Triangle extends Share {       //Triangle類別繼承Share抽象類別
   public double area(double H, double B) {
      return (H * B) / 2;
   }
}

class Rectangle extends Share {      //Rectangle類別繼承Share抽象類別
   public double area(double H, double W) {
      return H * W;
   }
}

public class PolymorphismDemo1 {
   public static void main(String[] args) {
       double high, base;
       Share sha;                          //宣告Share類別的參考變數sha
       Triangle tri = new Triangle();      //產生Triangle類別的物件tri
       Rectangle rec = new Rectangle();    //產生Rectangle類別的物件rec
	
	   Scanner scn = new Scanner(System.in);   //建立scn物件接受輸入資料
	   while (true) {
	      System.out.print("請選擇形狀：(1.三角形   2.矩形    0.離開) ？ ");
	      int item = scn.nextInt();            
	      if (item == 1) {
	         System.out.print("請輸入 高 ？ ");
	         high = scn.nextDouble();
	         System.out.print("請輸入 底 ？ ");
	         base = scn.nextDouble();
	         System.out.print("三角形： 高 = " + high + "，底 = " + base);
	         sha = tri;                        //sha參考變數指到tri物件
	      } else if (item == 2) {
	         System.out.print("請輸入 高 ？ ");
		     high = scn.nextDouble();
		     System.out.print("請輸入 寬 ？ ");
		     base = scn.nextDouble();
		     System.out.print("矩形： 高 = " + high + "，寬 = " + base);
		     sha = rec;                        //sha參考變數指到rec物件
		  } else {
		     scn.close();
		     break;
		  }
		  //執行Share類別的area()方法
          System.out.println("，面積為 " + sha.area(high, base));
	   }
	}
}
