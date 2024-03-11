class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;

        first = findFirstOrLast(nums, target, true);
        last = findFirstOrLast(nums, target, false);

        return new int[]{first, last};
    }

    int findFirstOrLast(int[] arr, int target, boolean isFirst) {
        int l = 0;
        int r = arr.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l)/2;
            
            if (arr[m] == target) {
                ans = m;
                if (isFirst) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        if (ans == -1) {
            return -1;
        }
        return ans;
    }
}