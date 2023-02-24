package test06_5;

public class ScopeTester {
    int x = 5; 
	static int y = 5; 
	 
	public void test() { 
	    int x = 10; 
	    int y = 10; 
	 
	    System.out.println("x = " + x); 
	    System.out.println("this.x = " + this.x); 
	    System.out.println("y = " + y); 
	    System.out.println("ScopeTester.y = " + ScopeTester.y); 
	} 

    public static void main(String[] args) {
    	ScopeTester scope = new ScopeTester();
    	scope.test();
	}
}

