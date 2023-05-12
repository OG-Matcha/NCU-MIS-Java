package selfPackage;
import otherPackage.Other;

public class Self {
	public static void main(String[] args) {
		Another obj_a = new Another();
		obj_a.show_a();		 
		obj_a.show_b();		
		obj_a.show_c();		  
		//obj_a.show_d();  	  //這是不可以用的
		
		System.out.println();
		Other obj_o = new Other();
		//obj_o.show_a();     //這是不可以用的
		obj_o.show_b();		
		//obj_o.show_c();	  //這是不可以用的
		//obj_o.show_d();  	  //這是不可以用的
	}
}
