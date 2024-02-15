class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] lh = new int[size];
        int[] rh = new int[size];

        lh[0] = height[0];        
        for (int i = 1; i < size; i++) {
            lh[i] = Math.max(lh[i - 1], height[i]);
        }

        rh[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rh[i] = Math.max(rh[i + 1], height[i]);
        }

        int area = 0;
        for (int i = 0; i < size; i++) {
            area += Math.min(lh[i], rh[i]) - height[i];
        }
        return area;
    }
}