class Solution {
    public void nextPermutation(int[] nums) {
        int rPoint = -1;
        if (nums.length == 1) {
            return;
        }
        int minIdx = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                rPoint = i - 1;
                for (int j = rPoint; j < nums.length; j++) {
                    int minDiff = 0;  
                    if (nums[rPoint] - nums[j] < minDiff) {
                        minIdx = j;
                    }
                }
                break;
            }
        }
        if (rPoint == -1) {
            Arrays.sort(nums);
            return;
        }
        
        
        int temp = nums[minIdx];
        nums[minIdx] = nums[rPoint];
        nums[rPoint] = temp;
        Arrays.sort(nums, rPoint + 1, nums.length);
    }
}