

public class Main {
    public static void main(String[] args) {
        System.out.println(isMatch("mississippi", "mis*is*p*."));
    }
    public static boolean isMatch(String s, String p) {

        for (int i = 0; i < s.length(); i++){
            int pIndex = (i%p.length());
            if (p.charAt(pIndex) == '*') {
                char[] pChar = p.toCharArray();
                pChar[pIndex] = p.charAt(pIndex - 1);
                StringBuilder pBuilder = new StringBuilder();
                for (char c : pChar) pBuilder.append(c);
                p = pBuilder.toString();
            }
            if (p.charAt(pIndex) != s.charAt(i) && p.charAt(pIndex) != '.')
                return false;
        }

        return s.length() == p.length();
    }
}