package staticDemo;

class A {
    public static int a = 10;
    public static int b ;
    public static int c = 50;

    

    public static void show() {
        b = 20;
        //c= 30;
        System.out.println("b ���ȬO: " + b);
        System.out.println("c ���ȬO: " + c);
    }
}

class B extends A {
    /* �����O��show��k��static�A�ҥH�l���O�L�k�мg
    public void show() {
        System.out.println("�o�O�l���O����k");
    }
    */
}

public class StaticDemo {
	public static void main(String[] args) {
	    System.out.println("���O A �� a ���ȬO: " + A.a);
		System.out.println("�{�b�n�����I�s���O A ������k����show()");
		A.show();
		
		//System.out.println("���O A �� c ���ȬO: " + A.c);
	}
}
