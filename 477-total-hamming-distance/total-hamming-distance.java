class Solution {
    public int totalHammingDistance(int[] nums) {
        int thd = 0;
        if (nums.length == 1) {
            return thd;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) 
                // thd += calHammingDist(nums[i], nums[j]);
                thd += Integer.bitCount(nums[i] ^ nums[j]);
        }
        return thd;
    }
    int calHammingDist(int num1, int num2) {
        int xor = num1 ^ num2;
        if (xor == 0) {
            return 0;
        }
        int setBits = 0;
        while (xor != 0) {
            int bm = 1;
            if ((xor & 1) != 0) {
                setBits++;
            }
            xor >>= 1;
        }
        return setBits;
    }
}