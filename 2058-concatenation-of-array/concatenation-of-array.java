class Solution {
    public int[] getConcatenation(int[] nums) {
        int nSize = nums.length * 2;
        int[] arr = new int[nSize];
        for (int i = 0; i < nSize; i++) {
            arr[i] = nums[i % (nums.length)];
        }
        return arr;
    }
}