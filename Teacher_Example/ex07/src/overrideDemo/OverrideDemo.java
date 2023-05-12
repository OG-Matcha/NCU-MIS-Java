package overrideDemo;

class CMath {
   public void getMax(int a, int b) {
      int bigNum;
      if (a>b) bigNum = a;
      else bigNum = b;
      System.out.println(a + " ㎝ " + b + " 程计 " + bigNum);
   }
}

class SonCMath extends CMath {
   public void getMax(int a, int b) {
   if(a>b)
	  System.out.println(a + " ㎝ " + b + " 程计 " + a);
   else if(a<b)
      System.out.println(a + " ㎝ " + b + " 程计 " + b);
   else
      System.out.println(a + " ㎝ " + b + " 妓");
   }
}

public class OverrideDemo {
   public static void main(String[] args) {
      CMath math3 = new CMath();
	  math3.getMax(20, 20);         //㊣CMath摸getMax()よ猭
	  SonCMath math4 = new SonCMath();
	  math4.getMax(20, 20);         //㊣SonCMath摸getMax()よ猭
   }
}