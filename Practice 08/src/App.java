import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int m, n;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Input m: ");
            m = sc.nextInt();

            if (m == 999) {
                break;
            }

            System.out.print("Input n: ");
            n = sc.nextInt();

            if (m >= n) {
                System.out.println("最大公因數為: " + gcd(m, n));
            } else {
                System.out.println("最大公因數為: " + gcd(n, m));
            }
        }

        sc.close();
    }

    static int gcd(int m, int n) {
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}
