package constructor;

class Ccar {
   private double gas = 50;           //初始化gas(最多載油量)資料成員預設值
   private double tbo = 12;           //初始化tbo(平均耗油量)資料成員預設值
   private double max_dist;           //加滿油可行駛最長距離
   private void setGas(double g) {
     if(g>30 && g<80) gas = g;
   }
   private void setTbo(double t) {
     if(t>4 && t<20) tbo = t;
   }
   
   private void maxDist() {           //計算可行駛最長距離
     max_dist = gas * tbo;
   }
   
   public Ccar() {              //Ccar類別的構式,沒有傳入引數
     maxDist();
   }            
   public Ccar(double g) {      //Ccar類別的構式,傳入一個引數
     setGas(g);                 //呼叫setGas()方法,初始化gas資料成員
     maxDist();
   }
   public Ccar(double g, double t) {   //Ccar類別的構式,傳入二個引數
     setGas(g);                 //呼叫setGas()方法,初始化gas資料成員
     setTbo(t);                 //呼叫setGas()方法,初始化gas資料成員
     maxDist();
   }
   
   public double getDist() {      //傳出資料
     return max_dist;
   }
}

public class Constructor {                    //主類別
   public static void main(String[] args) {    //主程式
     Ccar car1 = new Ccar();                   //使用沒有引數的建構式
     System.out.println("new Ccar() 加滿油可行駛 " + car1.getDist() + " km");
     Ccar car2 = new Ccar(40.5);               //使用一個引數的建構式
     System.out.println("new Ccar(40.5) 加滿油可行駛 " + car2.getDist() + " km");
     Ccar car3 = new Ccar(64.5, 9.2);          //使用二個引數的建構式
     System.out.println("new Ccar(64.5,9.2) 加滿油可行駛 " + car3.getDist() + " km");
  }
}
