package finalDemo2;

class Ccar {
   private final int speed = 120 ;
   public final void showBigSpeed(String s)  {
       System.out.println(s + " 最大速度是 " + speed + " 公里！");
   }
   public void showBigSpeed(String s, int n) {
	      System.out.println("父類別下的" + s + " 加強後最大速度是 " + n + " 公里！");
	   }
}

class PiliCcar extends Ccar {
   public void showBigSpeed(String s, int n) {
      System.out.println(s + " 加強後最大速度是 " + n + " 公里！");
   }
}

public class FinalDemo2 {
   public static void main(String[] args) {
      Ccar car1 = new Ccar();
      car1.showBigSpeed("car1");      //呼叫Ccar父類別的showBigShow()
      PiliCcar car2 = new PiliCcar();
      car2.showBigSpeed("car2");      //呼叫Ccar父類別的showBigShow()
      car2.showBigSpeed("car2", 180);   //呼叫PiliCcar子類別的showBigShow()
   }
}
