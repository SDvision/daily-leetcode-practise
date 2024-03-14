class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int lastZeroIdx = -1;
        int i = 0;
        for (; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, i - lastZeroIdx - 1);
                lastZeroIdx = i;
            }
        }
        return Math.max(max, i - lastZeroIdx - 1);
    }
}