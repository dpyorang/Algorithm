/* https://leetcode.com/problems/valid-palindrome/description/ */

public class ValidPalindrome {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(String s) {
        StringBuilder palindS = new StringBuilder();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);

            if ((ascii >= 48 && ascii <=57) || (ascii >= 97 && ascii <= 122)) {
                palindS.append(s.charAt(i));
            }
        }

        return palindS.toString().equals(palindS.reverse().toString());
    }
}
