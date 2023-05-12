package staticDemo;

class A {
    public static int a = 10;
    public static int b ;
    public static int c = 50;

    

    public static void show() {
        b = 20;
        //c= 30;
        System.out.println("b 的值是: " + b);
        System.out.println("c 的值是: " + c);
    }
}

class B extends A {
    /* 父類別的show方法為static，所以子類別無法覆寫
    public void show() {
        System.out.println("這是子類別的方法");
    }
    */
}

public class StaticDemo {
	public static void main(String[] args) {
	    System.out.println("類別 A 中 a 的值是: " + A.a);
		System.out.println("現在要直接呼叫類別 A 中的方法成員show()");
		A.show();
		
		//System.out.println("類別 A 中 c 的值是: " + A.c);
	}
}
