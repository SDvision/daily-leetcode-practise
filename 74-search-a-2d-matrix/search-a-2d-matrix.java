class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        int targetRow = 0;
        while (targetRow < matrix.length && target > matrix[targetRow][matrix[0].length - 1]) {
            targetRow++;
        }
        int l = 0;
        int r = matrix[0].length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (matrix[targetRow][m] == target) {
                return true;
            }
            if (matrix[targetRow][m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}