package constructorExtend;

class CMath {
   protected int a = 1;
   CMath() {
      System.out.println("a = " + a);
   }
   CMath(int b) {
	      System.out.println("b = " + b);
	   }
}

class SonCMath extends CMath {
   protected int b = 2;
   SonCMath() {
      System.out.println("a + b = " + (a + b));
   }
}

class GrandSonCMath extends SonCMath {
   protected int c = 4;
   GrandSonCMath() {
      System.out.println("a + b + c = " + (a + b + c));
   }
   GrandSonCMath(int d) {
	      System.out.println("d = " + d);
	   }
}

public class ConstructorExtend {
	public static void main(String[] args) {
	   //new GrandSonCMath();   // 採匿名物件的方式來建立物件實體
	   new GrandSonCMath(100);
	   //new CMath(200);
	}
}
