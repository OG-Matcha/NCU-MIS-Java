package interfaceDemo1;

interface IMove {                   //IMove介面
    public int ENGINE_NUM = 1;       //介面常數
    public void addSpeed(int s);     //只宣告介面的方法，無程式碼
}

class PiliCar implements IMove {    //PiliCar類別實作IMove介面
    private int speed;
    public void addSpeed(int s) {    //實作IMove介面的addSpeed方法內程式碼
        System.out.println("霹靂車目前速度：" + speed);
	    speed += s ;
	    System.out.println("霹靂車  加速後：" + speed);
    }
}

class BMXCar implements IMove {     //BMXCar類別實作IMove介面
    private int speed;
    public void addSpeed(int s) {  //實作IMove介面的addSpeed方法內程式碼
        System.out.println("BMX目前速度：" + speed);
        speed += s ;
        if(speed <= 200)
            System.out.println("BMX  加速後：" + speed);
        else
            System.out.println("BMX最大速度 200 無法再加速了");
    }
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		System.out.println("所有車子有 " + IMove.ENGINE_NUM + " 個引擎！");
		PiliCar car1 = new PiliCar();
		car1.addSpeed(150);
		car1.addSpeed(120);
		System.out.println("霹靂車有 " + IMove.ENGINE_NUM + " 個引擎！");
		BMXCar car2 = new BMXCar();
		car2.addSpeed(150);
		car2.addSpeed(120);
		System.out.println("BMX有 " + IMove.ENGINE_NUM + " 個引擎！");
	}
}
