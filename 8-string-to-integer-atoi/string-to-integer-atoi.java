class Solution {
    public int myAtoi(String s) {
        
        // edge case
        if (s.length() == 0) {
            return 0;
        }

        long num = 0;
        boolean ignoredLeadingWS = false;
        boolean detectedSign = false;
        boolean isPositive = true;
        List<Integer> nums = new ArrayList<>();


        for (int i = 0; i < s.length(); i++) {
            // ignore white spaces at start
            if (!ignoredLeadingWS && s.charAt(i) == ' ') {
                continue;
            }
            if (!detectedSign && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
                ignoredLeadingWS = true;
                detectedSign = true;
                if (s.charAt(i) == '-')
                    isPositive = false;
                continue;
            }
            if (Character.isDigit(s.charAt(i))) {
                ignoredLeadingWS = true;
                detectedSign = true;
                int val = s.charAt(i) - '0';
                if (nums.size() == 0 && val == 0) {
                    continue;
                }
                nums.add(val);
            } else {
                break;
            }
        }
        if (nums.size() > 10) {
            if (isPositive)
                return Integer.MAX_VALUE;
            return Integer.MIN_VALUE;
        }
        for (int i = 0; i < nums.size(); i++) {
            num = num * 10 + nums.get(i);
            if (isPositive && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (!isPositive && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        if (isPositive)
            return (int)num;
        return (int)-num;
    }
}