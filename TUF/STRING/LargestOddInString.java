package TUF.STRING;

public class LargestOddInString {
    public static String findLargestOdd(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str = "1234567890";
        String largestOdd = findLargestOdd(str);
        System.out.println("Largest odd digit in the string: " + largestOdd);
    }
}
