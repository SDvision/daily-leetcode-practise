class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        
        int[] result = new int[2];
        result[0] = findStartIdx(nums, s, e, target);
        result[1] = findEndIdx(nums, s, e, target);
        return result;
    }

    int findStartIdx(int[] arr, int s, int e, int target) {
        int index = -1;
        while (s <= e) {
            int mid = s + (e - s)/2;
            if (target == arr[mid]) {
                index = mid;
                e = mid - 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return index;
    }
    
    int findEndIdx(int[] arr, int s, int e, int target) {
        int index = -1;
        while(s <= e) {
            int mid = s + (e - s)/2;
            if (target == arr[mid]) {
                index = mid;
                s = mid + 1;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return index;
    }
}