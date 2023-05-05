import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String words = scanner.nextLine();

        int total = count(words, 0);
        System.out.printf("%s has %d As", words, total);

        scanner.close();
    }

    public static int count(String words, int cnt) {
        if (words.length() == 0) {
            return cnt;
        }
        if (words.startsWith("A")) {
            cnt++;
        }
        return count(words.substring(1, words.length()), cnt);
    }
}
