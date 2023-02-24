package ex02;
public class Ex02_T02 {
	
	static void StrToNum(String str){
        double num = Double.parseDouble(str);
        System.out.println(num);
    }
	
	public static void main(String[] args) {
		String a = "123.45";
		StrToNum(a);
	}

}

