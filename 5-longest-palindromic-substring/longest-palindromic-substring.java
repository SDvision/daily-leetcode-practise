class Solution {
    boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        String result = "";
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i; j <= s.length(); j++) {
                String subS = s.substring(i, j);
                if (j == s.length()) {
                    subS = s.substring(i);
                }
                if (isPalindrome(subS)) {
                    if (result.length() < subS.length()) {
                        result = subS;
                    }
                }
            }
        }
        return result;
    }
}