class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        int mid = row/2;
        int sum = 0;

        for (int i = 0; i < row; i++) {
            sum += mat[i][i] + mat[i][row - 1 - i];
        }
        if (row % 2 != 0) {
            sum -= mat[mid][mid];
        }
        return sum;
    }
}