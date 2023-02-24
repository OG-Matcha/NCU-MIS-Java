package test06_6;

public class JavaProgram1 {
    int x = 25;
    
	public static void main(String[] args) {
	    JavaProgram1 app = new JavaProgram1(); 
	    { int x = 5; }
	    { int x = 10; }
	    int x = 100;
	    System.out.println(x);
	    System.out.println(app.x);
	}
	
	public JavaProgram1() {
	    int x = 1;
	    System.out.println(x);
	}
}
