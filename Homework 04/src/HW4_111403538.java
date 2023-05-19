import java.util.Scanner;

public class HW4_111403538 {
    public static void main(String[] args) throws Exception {

        System.out.print("Josephus numbers: ");
        // 使用迴圈輸出每一個約瑟夫數
        for (int i = 1; i <= 20; i++) {
            System.out.print(josephusNumber(i) + " ");
        }

        // 換行
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            // 接收數字輸出結果
            System.out.print("Please Input Decimal: ");
            int num = scanner.nextInt();
            System.out.printf("%d's Binary is: %s\n\n", num, D2B(num, ""));
        }

        scanner.close();
    }

    public static int josephusNumber(int n) {
        // J(1) = 1 遞迴基底值
        if (n == 1) {
            return 1;
            // J(2n) = 2 * J(n) - 1 若為偶數則呼叫對應公式
        } else if (n % 2 == 0) {
            return 2 * josephusNumber(n / 2) - 1;
            // J(2n + 1) = 2 * J(n) + 1 若為奇數則呼叫對應公式
        } else {
            return 2 * josephusNumber(n / 2) + 1;
        }
    }

    public static String D2B(int n, String res) {
        // 數字為 0 則回傳結果 遞迴基底值
        if (n == 0) {
            return res;
        }
        // 將位元右移一位後傳入下次遞迴，將新的二進位連接在舊結果前方傳入下次遞迴
        return D2B(n >> 1, Integer.toString(n & 1) + res);
    }
}