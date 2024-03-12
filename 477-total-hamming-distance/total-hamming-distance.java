class Solution {
    public int totalHammingDistance(int[] nums) {
        int thd = 0;
        for (int i = 0; i < 32; i++) {
            int oneBits = 0;
            for (int j = 0; j < nums.length; j++) {
                int num = nums[j];
                if (((num >>= i) & 1) == 1)
                    oneBits++;
            }
            thd += (oneBits) * (nums.length - oneBits);
        }
        return thd;
    }
}