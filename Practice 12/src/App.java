import java.util.Scanner;

class Shape {
    public double calculateArea() {
        return 0.0; // 計算面積
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        // Constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius; // 覆寫計算面積，計算圓形的面積
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        // Constructor
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width; // 覆寫計算面積，計算長方形的面積
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        // Constructor
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.base * this.height / 2; // 覆寫計算面積，計算三角形的面積
    }
}

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入圓形半徑：");
        // create 圓形
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);

        System.out.println("輸入長方形的長跟寬：");
        // create 長方形
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);

        System.out.println("輸入三角形的底跟高：");
        // create 三角形
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        Triangle triangle = new Triangle(base, height);

        System.out.println("Circle area: " + circle.calculateArea()); // 個別輸出圖形面積
        System.out.println("Rectangle area: " + rectangle.calculateArea()); // 個別輸出圖形面積
        System.out.println("Triangle area: " + triangle.calculateArea()); // 個別輸出圖形面積

        sc.close();
    }
}
