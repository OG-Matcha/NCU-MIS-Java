package finalDemo1;

final class Cdog  {    //無法被繼承
   int weight ;
}

/* 因為Cdog類別為final，所以Ccat無法繼承Cdog
class Ccat extends Cdog { }
*/

class Ccar {
   //private final int speed;   //此寫法錯誤,必須指定初值
   private final int speed = 150 ;
   public final void showBigSpeed(String s) {
      System.out.println(s + " 最大速度是 " + speed + " 公里！");
   }
}

class PiliCcar extends Ccar {
   /* 父類別的showBigSpeed方法為final，所以子類別無法覆寫
   public void showBigSpeed(String s) {
      System.out.println(s + " 最大速度是 " + speed + " 公里！");
   }
   */
}

public class FinalDemo1 {
   public static void main(String[] args) {
      Ccar car1 = new Ccar();
	  car1.showBigSpeed("car1");
      PiliCcar car2 = new PiliCcar();
      car2.showBigSpeed("car2");
   }
}
