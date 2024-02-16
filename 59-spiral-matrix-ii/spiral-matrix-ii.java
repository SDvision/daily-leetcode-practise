class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int rLow = 0;
        int rHigh = n - 1;
        int cLow = 0;
        int cHigh = n - 1;

        int i = 1;

        while (rLow <= rHigh && cLow <= cHigh) {
            // fill top row -> left to right
            for (int c = cLow; c <= cHigh; c++) {
                arr[rLow][c] = i++;
            }

            // fill the last col -> top to bottom
            for (int r = rLow + 1; r <= rHigh; r++) {
                arr[r][cHigh] = i++;
            }

            // fill the last row -> right to left
            for (int c = cHigh - 1; c >= cLow; c--) {
                arr[rHigh][c] = i++;
            }

            // fill the first col -> bottom to top
            for (int r = rHigh - 1; r > rLow; r--) {
                arr[r][cLow] = i++;
            }

            rLow++;
            rHigh--;
            cLow++;
            cHigh--;
        }
        return arr;
    }
}