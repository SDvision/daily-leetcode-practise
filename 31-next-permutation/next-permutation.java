class Solution {
    public void nextPermutation(int[] nums) {
        int rPoint = -1;
        if (nums.length == 1) {
            return;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                rPoint = i - 1;
                break;
            }
        }
        if (rPoint == -1) {
            Arrays.sort(nums);
            return;
        }
        int minIdx = 0;
        for (int i = rPoint; i < nums.length; i++) {
            int minDiff = 0;
            
            if (nums[rPoint] - nums[i] < minDiff) {
                minIdx = i;
            }
        }
        int temp = nums[minIdx];
        nums[minIdx] = nums[rPoint];
        nums[rPoint] = temp;
        Arrays.sort(nums, rPoint + 1, nums.length);
    }
}