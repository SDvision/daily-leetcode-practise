class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];

        int l = 0;
        int r = nums.length - 1;
        int m = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (m != nums.length - 1 && nums[m] == nums[m ^ 1]) {
                l = m + 1;
            } else {
                if (m != 0 && m != nums.length - 1 && nums[m] != nums[m - 1] && nums[m] != nums[m + 1]) {
                    return nums[m];
                }
                r = m - 1;
            }
        }
        return nums[m];
    }
}