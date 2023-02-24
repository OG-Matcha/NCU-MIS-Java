package ex03;
public class BreakLabel2 {
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Block1:{
			for(i=0;i<100;i++){
				for(j=0;j<100;j++){
					for(k=0;k<100;k++){
					if(i==10 && j==20 && k==30)
							break Block1;
					}
				}
			}
		}
		System.out.println("一口氣跳出三個for迴圈");
		System.out.println("此時 i = " + i + "、 j = " + j + "、 k = " + k);
	}
}

