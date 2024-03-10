class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int cR = 0;
        int cC = col - 1;

        while (cR < row && cC >= 0) {
            if (matrix[cR][cC] == target) {
                return true;
            } else {
                if (target < matrix[cR][cC]) {
                    cC--;
                } else {
                    cR++;
                }
            }
        }
        return false;
    }
}