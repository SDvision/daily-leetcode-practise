class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m != nums.length - 1 && nums[m] == nums[m ^ 1]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return nums[l];
    }
}