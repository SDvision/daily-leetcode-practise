class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] countArr = new int[101];
        for (int i = 0; i < nums.length; i++) {
            count += countArr[nums[i]]++;
        }
        return count;
    }
}