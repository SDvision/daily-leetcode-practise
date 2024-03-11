class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m - 1 < 0 || nums[m] > nums[m - 1]) {
                if (m + 1 >= nums.length ||  nums[m] > nums[m + 1]) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}