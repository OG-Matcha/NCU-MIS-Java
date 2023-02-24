package ex06;

public class Ccar {
	public double gas, tbo;              //宣告最多載油量, 平均耗油量
	public double max_dist = 0;          //加滿油可行駛最長距離
	
	public void maxDist() {              //計算可行駛最長距離
	    max_dist = gas * tbo;
	}
	 
	public double dist(double oil) {     //一般加油可行駛距離
	    return oil * tbo;
	}
}

