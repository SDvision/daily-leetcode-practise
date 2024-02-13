class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while(s < e) {
            int mid = (s + e)/2;
            if (nums[mid] > nums[e]) {
                s = mid + 1;
                continue;
            }
            e = mid;
        }
        return nums[s];
    }
}