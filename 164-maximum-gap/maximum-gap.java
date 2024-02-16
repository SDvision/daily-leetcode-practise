class Solution {
    public int maximumGap(int[] nums) {
        int maxDiff = Integer.MIN_VALUE;
        if (nums.length <= 1) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i+1] - nums[i];
            if (diff > maxDiff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
}