package abstractDemo;

abstract class Cscore {            //抽象類別
   protected int chia, math;        //國文成績,數學成績

   public abstract double avgScore();    //抽象方法

   protected Cscore(int chia, int math) {
      this.chia = chia;
      this.math = math;
   }
}
 
class SimpleAvg extends Cscore {   //繼承Cscore抽象類別,必須要實作抽象方法
   SimpleAvg(int chia, int math) {    
      super(chia, math);
   }

   public double avgScore() {             //實作avgScore()抽象方法
      return (float) (chia + math) / 2;
   }
}

class WeightAvg extends Cscore {    //繼承Cscore抽象類別,必須要實作抽象方法
   private int w1, w2;

   WeightAvg(int chia, int math, int w1, int w2) {
      super(chia, math);
      this.w1 = w1;
      this.w2 = w2;
   }

   public double avgScore() {        //實作avgScore()抽象方法
      return (float) (chia * w1 + math * w2) / (w1 + w2);
   }
}

public class AbstractDemo {
   public static void main(String[] args) {
	  String name = "蘇偉啟";
      int chia = 92, math = 73;            //分數
      SimpleAvg avg1 = new SimpleAvg(chia, math);
      System.out.println("姓名\t國文\t數學\t平均分數");
      System.out.printf("%s\t%d\t%d\t%2.1f%n", name, chia, math, avg1.avgScore());
	  System.out.println("----------------------------------");
	  int wt1 = 2, wt2 = 3;                //加權
	  WeightAvg avg2 = new WeightAvg(chia, math, wt1, wt2);
      System.out.println("姓名\t國文\t數學\t加權平均");
      System.out.printf("%s\t%d\t%d\t%2.1f%n", name, chia, math, avg2.avgScore());
      //Cscore avg3 = new Cscore(chia, math);    //錯誤,抽象類別無法產生實體
   }
}
