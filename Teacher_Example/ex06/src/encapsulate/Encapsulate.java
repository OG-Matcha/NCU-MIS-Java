package encapsulate;

class Ccar {                      //汽車類別
    private double gas, tbo;       //宣告最多載油量, 平均耗油量
    private double max_dist;       //加滿油可行駛最長距離

    private void maxDist() {       //計算可行駛最長距離
       max_dist = gas * tbo;
    }

    public void setValue(double g, double t) { //傳入資料
       gas = g;
       tbo = t;
       maxDist();
    }

    public double getDist() {      //傳出資料
       return max_dist;
    }
 }

public class Encapsulate {       //主類別
    public static void main(String[] args) { //主程式
       Ccar car1;                            //宣告car1物件
       car1 = new Ccar();                    //建立car1物件
       double g1 = 40, t1 = 13.6;
       car1.setValue(g1, t1);                //設定car1物件的屬性值
       double distance1 = car1.getDist();    //取得car1物件的方法傳回值
       System.out.println("car1加滿油可行駛 " + distance1 + " km");
       Ccar car2 = new Ccar();               //宣告並建立car2物件
       car2.setValue(60, 9.5);               //設定car1物件的屬性值
       System.out.println("car2加滿油可行駛 " + car2.getDist() + " km");
    }
}

