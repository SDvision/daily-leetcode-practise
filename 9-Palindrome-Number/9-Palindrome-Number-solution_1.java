class Solution {
    public boolean isPalindrome(int x) {
        int revNum = 0;
        int n = x;
        int rem;
        while(n>0) {
            rem = n%10;
            revNum = (revNum * 10) + rem;
            n/=10;
        }
        return revNum == x;
    }
}
