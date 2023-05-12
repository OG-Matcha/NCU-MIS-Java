package test07_9;

class Rectangle {
    private int width;
    private int length;

    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int area() {
        return this.width * this.length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}

public class Test07_9 {
	public static void main(String[] args) {
		int areaNum;
		Rectangle rect=new Rectangle(20,40);
		areaNum=rect.area();
		System.out.printf("Width=%d Length=%d\n",rect.getWidth(),rect.getLength());
		System.out.printf("Area is correct %b\n", areaNum==800);
	}
}
