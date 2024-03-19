class Solution {
    public int get4DivisorSum(int num) {
        int divisors = 2;
        int one = 0;
        int two = 0;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                if (one == 0) {
                    System.out.println("one" + one);
                    one = i;
                } else {
                    System.out.println("two" + two);
                    two = i;
                }
                divisors--;
            }
            if (divisors == -1) {
                return 0;
            }
        }
        if (divisors == 0) {
            return 1 + num + one + two;
        } else {
            return 0;
        }
    }
    
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                continue;
            }
            sum += get4DivisorSum(nums[i]);
        }
        return sum;
    }
}