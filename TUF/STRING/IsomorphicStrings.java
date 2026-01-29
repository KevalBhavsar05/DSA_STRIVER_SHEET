package TUF.STRING;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int m = s.length();

        int[] ms = new int[256];
        int[] mt = new int[256];

        for (int i = 0; i < m; i++) {
            if (ms[s.charAt(i)] != mt[t.charAt(i)])
                return false;
            // Update the mapping by storing the index + 1 (to avoid default 0 issue) --
            // Update by last seen index
            ms[s.charAt(i)] = i + 1;
            mt[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        System.out.println(isIsomorphic(s, t));
    }
}
