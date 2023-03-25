/**
 * This class contains a program that parses a string and performs some
 * operations on it.
 */
class HW1_111403538 {

    /**
     * Checks whether a given integer is prime.
     * 
     * @param num the integer to check
     * @return true if the integer is prime, false otherwise
     */
    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * The main method of the program.
     */
    public static void main(String[] args) {
        // The input string to parse
        String input = "*i!t c$ou7l#d %ch(an)ge b8ut this+ feel<s li%^ke like t>h9e ca/lm be??fore th[e s=to=rm "
                + "*not that |*i do''n't w3an/,.na t~!ry but *i've &b;ee3n here6 be@.fore";

        // The result string after parsing
        String result = "";

        // A temporary string to hold a number being parsed from the input string
        String tempNum = "";

        // The sum of all prime numbers found in the input string
        int primeSum = 0;

        // A flag to indicate whether the next alphabetic character should be uppercase
        boolean upperCase = false;

        // A flag to indicate whether the current character is a number
        boolean findDigit = false;

        // Loop through each character in the input string
        for (char c : input.toCharArray()) {
            // If the character is "*", set the uppercase flag and clear the digit flag
            if (c == '*') {
                upperCase = true;
                findDigit = false;
            }

            // If the character is alphabetic or whitespace
            if (Character.isAlphabetic(c) || Character.isWhitespace(c)) {
                // If the uppercase flag is set, append the uppercase version of the character
                // and clear the uppercase flag
                if (upperCase) {
                    result += Character.toUpperCase(c);
                    upperCase = false;
                }
                // Otherwise, simply append the character
                else {
                    result += c;
                }
                // Clear the digit flag
                findDigit = false;
            }

            // If the character is a digit
            if (Character.isDigit(c)) {
                // Append the digit to the temporary string and set the digit flag
                tempNum += c;
                findDigit = true;
            }

            // If the digit flag is not set
            if (!findDigit) {
                // If the temporary string contains a number, parse it and check if it's prime,
                // adding it to the prime sum if it is
                if (tempNum.length() > 0) {
                    int num = Integer.parseInt(tempNum);
                    if (checkPrime(num)) {
                        primeSum += num;
                    }
                }
                // Clear the temporary string
                tempNum = "";
            }
        }

        // Print the result
        System.out.println(result);
        System.out.println(primeSum);
    }
}