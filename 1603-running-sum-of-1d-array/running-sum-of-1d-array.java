class Solution {
    public int[] runningSum(int[] nums) {
        int[] sol = new int[nums.length];
        sol[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sol[i] = sol[i - 1] + nums[i];
        }
        return sol;
    }
}