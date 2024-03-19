class Solution extends SolBase {
    public int rand10() {
        int a = rand7();
        int b = rand7();
        int tcv = (49 / 10) * 10;
        int val = ((a - 1) * 7 + b);
        while (val > tcv) {
            return rand10();
        }
        
        return (val % 10) + 1;
    }
}