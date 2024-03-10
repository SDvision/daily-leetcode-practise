class Solution {
    public int maxChunksToSorted(int[] arr) {
        if (arr.length == 1) {
            return 1;
        }

        int[] leftMax = new int[arr.length];
        int[] rightMin = new int[arr.length];

        createLeftMax(arr, leftMax);
        createRightMin(arr, rightMin);

        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (leftMax[i] <= rightMin[i + 1]) {
                ans++;
            }
        }
        return ans + 1;
    }

    void createLeftMax(int[] arr, int[] leftMax) {
        int max = arr[0];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(leftMax[i-1], arr[i]);
            leftMax[i] = max;
        }
    }

    void createRightMin(int[] arr, int[] rightMin) {
        int length = arr.length;
        int min = arr[length - 1];
        rightMin[length - 1] = arr[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            min = Math.min(rightMin[i+1], arr[i]);
            rightMin[i] = min;
        }
    }
}