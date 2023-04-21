import java.util.Scanner;
import java.util.Arrays;

public class HW2_111403538 {
    public static int[] PlusTwo(int[] digits) {
        // flag 用來判斷是否需要進位
        int carry = 0;
        int sum = 0;

        // 從倒數第二位開始往回做進位
        for (int i = digits.length - 1; i > 0; i--) {
            // 計算每一次總和
            sum = digits[i] + carry;

            // 假如為最低位，執行加二
            if (i == digits.length - 1) {
                sum += 2;
            }

            // 假如總和為二位數即進位並改變 flag
            if (sum > 9) {
                digits[i] = sum - 10;
                carry = 1;
            } else {
                digits[i] = sum;
                carry = 0;
                break;
            }
        }

        // 假如最後 flag 為真代表需要進位，改變最高位並回傳。 反之回傳不含最高位的陣列
        if (carry == 1) {
            digits[0] = 1;
            return digits;
        } else {
            return Arrays.copyOfRange(digits, 1, digits.length);
        }

    }

    public static void main(String[] args) {

        // 輸入陣列大小
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入陣列大小:");
        int size = scanner.nextInt();

        // 預設多一位給可能發生的進位
        int nums[] = new int[size + 1];

        // 輸入陣列內容
        for (int i = 1; i < nums.length; i++) {
            System.out.printf("輸入第%d位 : ", i);
            nums[i] = scanner.nextInt();
        }

        // 之後不須輸入，關閉 Scanner
        scanner.close();

        // 暫時先不考慮為進位保留的位置
        int temp_nums[] = Arrays.copyOfRange(nums, 1, size + 1);
        // 印出輸入的陣列
        System.out.println("輸入的陣列 : " + Arrays.toString(temp_nums));

        // 印出加二後的陣列 (PlusTwo)
        System.out.println("加二後的陣列 : " + Arrays.toString(PlusTwo(nums)));
    }
}