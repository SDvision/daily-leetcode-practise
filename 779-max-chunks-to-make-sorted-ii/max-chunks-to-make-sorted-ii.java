class Solution {
    public int maxChunksToSorted(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }

        int[] leftMax = new int[arr.length];
        int[] rightMin = new int[arr.length];

        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }
        rightMin[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMin[i] = Math.min(arr[i], rightMin[i + 1]);
        }

        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (leftMax[i] <= rightMin[i + 1]) {
                ans++;
            }
        }
        return ans + 1;
    }

 }