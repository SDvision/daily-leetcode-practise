class Solution {
    public int[][] transpose(int[][] matrix) {
        int tm[][] = new int[matrix[0].length][matrix.length];
        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                tm[j][i] = matrix[i][j];
            }
        }

        return tm;
    }
}