class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;
        while (temp > 0) {
            int bit = temp % 10;
            sum += bit;
            prod *= bit;
            temp = temp / 10;
        }
        return prod - sum;
    }
}