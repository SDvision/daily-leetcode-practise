class NumMatrix {
    int matrix[][];
    int pSum[][];

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        pSum = new int[matrix.length][matrix[0].length];
        createPsum(matrix, pSum);
    }

    void createPsum(int[][] matrix, int[][] pSum) {
        pSum[0][0] = matrix[0][0];
        int row = matrix.length;
        int col = matrix[0].length;
        // fill first row
        if (col > 1) {
            for (int i = 1; i < col; i++) {
                pSum[0][i] = pSum[0][i-1] + matrix[0][i];
            }
        }
        // fill first col
        if (row > 1) {
            for (int i = 1; i < row; i++) {
                pSum[i][0] = pSum[i-1][0] + matrix[i][0];
            }
        }
        //fill other cells
        if (row > 1 && col > 1) {
            for (int i = 1; i < row; i++) {
                for (int j = 1; j < col; j++) {
                    pSum[i][j] = pSum[i-1][j] + pSum[i][j-1] - pSum[i-1][j-1] + matrix[i][j];
                }
            }
        }
    }

    int getVal(int row, int col) {
        if (row < 0 || col < 0) return 0;
        return pSum[row][col];
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int s = getVal(row2, col2);
        int a = getVal(row1 - 1, col2);
        int b = getVal(row2, col1 - 1);
        int c = getVal(row1 - 1, col1 - 1);
        return s - a - b + c;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */