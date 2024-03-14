class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        while ( n != 1) {
            count += n / 2;
            if (n % 2 != 0) {
                n++;
            }
            n /= 2;
            
        }
        return count;
    }
}