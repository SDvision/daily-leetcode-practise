class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size*2];
        for (int i = 0; i < size; i++) {
            arr[i] = nums[i];
            arr[i+size] = nums[i];
        }
        return arr;
    }
}