import java.lang.Math;
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int revNum=0;
        int numberOfDigits = (int) Math.ceil(Math.log(x) / Math.log(10));
        for(int i = 0; i < numberOfDigits / 2; i++) {
            revNum = (revNum*10) + x % 10;
            x /= 10;
        }
        if (numberOfDigits % 2 == 1) {
            revNum = (revNum * 10) + x % 10;
        }
        return revNum == x;
    }
}
