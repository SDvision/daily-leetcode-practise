class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];

        int row = mat.length;
        int col = mat[0].length;
        int newR = 0;
        int newC = 0;

        if (row * col != r * c) {
            return mat;
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[newR][newC] = mat[i][j];
                if (newC == c - 1) {
                    newC = 0;
                    newR++;
                    continue;
                }
                newC++;
            }
        }
        return res;
    }
}