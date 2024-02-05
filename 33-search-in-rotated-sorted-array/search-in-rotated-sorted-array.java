class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int max = nums.length - 1;

        while(low <= max) {
            int mid = (low + max) / 2;
            if (target == nums[mid])
                return mid;
            // left side sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    max = mid - 1;                   
                } else {
                    low = mid + 1;
                }
            } else { // right side sorted
                if (nums[mid] < target && target <= nums[max]) {
                    low = mid + 1;
                } else {
                    max = mid - 1;
                }
            }
        }
        return -1;
    }
}