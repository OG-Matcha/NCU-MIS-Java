import java.util.Scanner;

public class Quadrant {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("請輸入x座標: ");
            double x = scn.nextDouble();
            System.out.print("請輸入y座標: ");
            double y = scn.nextDouble();

            if (x == 0 && y == 0) {
                System.out.format("<%.2f,%.2f>在原點上\n", x, y);
            } else if (x == 0) {
                System.out.format("<%.2f,%.2f>在y軸上\n", x, y);
            } else if (y == 0) {
                System.out.format("<%.2f,%.2f>在x軸上\n", x, y);
            } else if (x > 0 && y > 0) {
                System.out.format("<%.2f,%.2f>在第一象限上\n", x, y);
            } else if (x < 0 && y > 0) {
                System.out.format("<%.2f,%.2f>在第二象限上\n", x, y);
            } else if (x < 0 && y < 0) {
                System.out.format("<%.2f,%.2f>在第三象限上\n", x, y);
            } else {
                System.out.format("<%.2f,%.2f>在第四象限上\n", x, y);
            }
        }

        scn.close();
    }
}
