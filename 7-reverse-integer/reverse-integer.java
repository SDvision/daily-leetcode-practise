class Solution {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int ld = x % 10;

            x = x / 10;
            result = result * 10 + ld;
        }
        if (result < Integer.MAX_VALUE && result > Integer.MIN_VALUE) {
            return (int)result;
        }

        return 0;
    }
}