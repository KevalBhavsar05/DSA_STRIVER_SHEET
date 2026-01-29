package TUF.STRING;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        // 1st Approach
        // Trim leading/trailing spaces and split by one or more spaces
        // String[] temp = s.trim().split("\\s+");
        // for (int i = temp.length - 1; i >= 0; i--) {
        // result.append(temp[i]);
        // if (i != 0) {
        // result.append(" ");
        // }
        // }

        // 2nd Approach
        int i = s.length() - 1;
        while (i >= 0) {
            // skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            // Break if we reach the beginning
            if (i < 0)
                break;
            int end = i;
            // Find the start of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            result.append(s.substring(i + 1, end + 1));
            if (result.length() != 0) {
                result.append(" ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println("Reversed Words: '" + reverseWords(s) + "'");
    }
}
