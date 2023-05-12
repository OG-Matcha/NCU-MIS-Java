package interfaceDemo2;
    
interface IMove {
    public void showSpeed();
}

interface IFly {
    public void showFly();
}

interface IAnimal extends IMove, IFly {  //IAnimal介面繼承IMove和IFly介面
    public void showAttack() ;
}

class CAirPlane implements IMove, IFly {   //實作IMove和IFly介面
    public void showSpeed() {
        System.out.println("飛機每一次加速，會增加 20公里！");
    }
    public void showFly() {
        System.out.println("飛機的最快移動方式，就是飛行！");
    }
}

class CSiteYaMan implements IAnimal {     //實作IAnimal介面
    public void showSpeed() {
        System.out.println("賽亞人每一次加速，會增加 30公里！");
    } 
    public void showFly() {
        System.out.println("賽亞人飛的速度比光速還快！");
    }
    public void showAttack() {
        System.out.println("賽亞人攻擊會使用龜派氣功！");
    }
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
	    CAirPlane air1 = new CAirPlane(); //建立CAirPlane類別的air1物件
		air1.showSpeed();         //呼叫CAirPlane類別的showSpeed()方法
		air1.showFly();           //呼叫CAirPlane類別的showFly()方法
		System.out.println();
		CSiteYaMan man1 = new CSiteYaMan();    //建立CSiteYaMan類別
		                                               //的man1物件
		man1.showSpeed();      //呼叫CSiteYaMan類別的showSpeed()方法
		man1.showFly();        //呼叫CSiteYaMan類別的showFly()方法
		man1.showAttack();     //呼叫CSiteYaMan類別的showAttack()方法
	}
}
