class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums.length == 1) {
            return nums[0];
        }
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] == nums[m ^ 1]) l = m + 1;
            else r = m;
        }
        return nums[l];
    }
}