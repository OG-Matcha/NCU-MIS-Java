package overload;              //宣告程式檔的類別置於overload套件內

class Cavg {
    public double getAvg(int num1, int num2) {
       return (num1+num2)/2;
    }

    public double getAvg(int[] vArray) {
       int n = vArray[0];
       for(int i=1; i<vArray.length; i++){
          n += vArray[i];
       }
       double avg = (double)n/vArray.length;
       return avg;
    }
}

public class Overload {                          //主類別
    public static void main(String[] args) {     //主程式
	   Cavg num = new Cavg();
	   int n1 = 20, n2 = 30;
	   System.out.println(n1 + " 和 " + n2 + "平均值為 " + num.getAvg(n1, n2));
	   int[] ary = {12,23,31,45,56};
	   System.out.println("{12,23,31,45,56}平均值為 " + num.getAvg(ary));
	}
}
