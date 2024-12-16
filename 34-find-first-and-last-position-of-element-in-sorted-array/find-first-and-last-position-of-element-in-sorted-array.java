class Solution {

    public static int getFirstOrLastInst(int target, int[] arr, boolean isFirst) {
        int l = 0, r = arr.length-1;
        int targetIdx = -1;

        while(l <= r) {
            int mid = (l + r)/2;
            if (target == arr[mid]) {
                targetIdx = mid;
                if (isFirst) r = mid - 1;
                if (!isFirst) l = mid + 1;
            } else if (target < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return targetIdx;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans  = {-1, -1};
        if (nums.length == 0) {
            return ans;
        }

        ans[0] = getFirstOrLastInst(target, nums, true);
        ans[1] = getFirstOrLastInst(target, nums, false);
        
        return ans;
    }
}