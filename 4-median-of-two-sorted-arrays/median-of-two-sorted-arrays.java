class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int idx1 = 0;
        int idx2 = 0;
        int i = 0;

        while (idx1 < nums1.length && idx2 < nums2.length) {
            if (nums1[idx1] <= nums2[idx2]) {
                merged[i++] = nums1[idx1++];
            } else {
                merged[i++] = nums2[idx2++];
            }
        }
        while(idx1 < nums1.length) {
            merged[i++] = nums1[idx1++];
        }
        while(idx2 < nums2.length) {
            merged[i++] = nums2[idx2++];
        }

        if (merged.length % 2 != 0) {
            return merged[merged.length/2];
        } else {
            return (merged[merged.length/2 - 1] + merged[merged.length/2]) / 2.0d;
        }
    }
}