class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (set.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while(s.charAt(left) != c) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}