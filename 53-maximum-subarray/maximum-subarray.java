class Solution {

    public int maxSubArray(int[] nums) {
        Integer max = Integer.MIN_VALUE;
        Integer currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            max = Math.max(max, currSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }
}