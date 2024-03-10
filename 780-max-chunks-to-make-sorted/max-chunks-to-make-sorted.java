class Solution {
    public int maxChunksToSorted(int[] arr) {
        int max = arr[0];
        int i = 0;
        int ans = 0;
        while (i < arr.length) {
            max = Math.max(arr[i], max);
            if (max == i) {
                ans++;
            }
            i++;
        }
        return ans;
    }
}