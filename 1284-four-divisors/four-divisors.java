class Solution {
    public int findDiv(int num) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i*i <= num; i++) {
            if (num % i == 0) {
                if (num / i == i) {
                    return 0;
                } else {
                    sum += i + (num/i);
                    count+=2;
                }
            }
        }
        return count == 4 ? sum : 0;
    }
    
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                continue;
            }
            sum += findDiv(nums[i]);
        }
        return sum;
    }
}