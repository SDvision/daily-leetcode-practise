class Solution {
    public int maximumWealth(int[][] accounts) {
        int rows = accounts.length;
        int cols = accounts[0].length;
        int maxAmt = 0;
        for (int i = 0; i < rows; i++) {
            int amt = 0;
            for (int j = 0; j < cols; j++) {
                amt += accounts[i][j];
            }
            if (maxAmt < amt) {
                maxAmt = amt;
            }
        }
        return maxAmt;
    }
}