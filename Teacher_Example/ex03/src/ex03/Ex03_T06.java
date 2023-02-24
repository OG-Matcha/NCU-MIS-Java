package ex03;

public class Ex03_T06 {
	public static String ages(int age) {
		String str;
		if(age>=65)
			str="老年";
		else if(age>=20)
			str="成年";
		else
			str="青年";
		return str;
	}
	
	public static void main(String[] args) {
		System.out.println(ages(70));
		System.out.println(ages(30));
		System.out.println(ages(15));
	}

}

