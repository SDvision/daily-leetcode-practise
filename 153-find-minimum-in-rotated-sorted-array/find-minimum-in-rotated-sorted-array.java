class Solution {
    int modifiedBinarySearch(int[] arr, int low, int high) {
        
        int mid = (high + low)/2;
        
        if (arr[low] <= arr[mid] && arr[mid] <= arr[high]) {
            return arr[low];
        } else {
            if (arr[high] < arr[mid]) { // pivot in right side
                return modifiedBinarySearch(arr, mid + 1, high);
            } else {
                return modifiedBinarySearch(arr, low, mid);
            }
        }
    }
    
    public int findMin(int[] nums) {
        return modifiedBinarySearch(nums, 0, nums.length - 1);
    }
}