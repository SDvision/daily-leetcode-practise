class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length () < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (needle.length() == 1) {
                    return i;
                }
                int k = i + 1;
                for (int j = 1; j < needle.length(); j++) {
                    if (k >= haystack.length() || needle.charAt(j) != haystack.charAt(k)) {
                        break;
                    }
                    if (j == needle.length() - 1 && needle.charAt(j) == haystack.charAt(k)) {
                        return i;
                    }
                    k++;
                }
            }
        }
        return -1;
    }
}