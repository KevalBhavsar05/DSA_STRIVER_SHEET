package TUF.InterviewQuestion;

public class removeParenthesesToMakeValid {
    public static String minRemoveToMakeValid(String s) {
        if (s.length() == 0)
            return "";
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (count > 0) {
                    res.append(c);
                }
            } else if (c == ')') {
                count--;
                if (count > 0) {
                    res.append(c);
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "a)b(c)d";
        System.out.println(minRemoveToMakeValid(s));
    }

}
