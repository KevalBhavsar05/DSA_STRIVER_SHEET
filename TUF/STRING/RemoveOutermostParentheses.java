package TUF.STRING;

public class RemoveOutermostParentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If it's an opening parenthesis
            // Increase the count
            // Basically we are tracking the depth of parentheses
            if (c == '(') {
                count++;
                // Only append if it's not the outermost
                if (count > 0)
                    result.append(c);
            } else {
                // If it's a closing parenthesis
                // Decrease the count
                count--;
                // Only append if it's not the outermost
                if (count > 0)
                    result.append(c);
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s)); // Output: ()()()
    }
}
