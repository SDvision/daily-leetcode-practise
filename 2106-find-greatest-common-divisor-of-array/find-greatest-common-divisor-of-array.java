class Solution {
    int gcd(int min, int max) {
        if (min == 0) return max;
        return gcd(max % min, min);
    }

    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        int gcd = gcd(min, max);
        return gcd;
    }
}