class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> zrow = new ArrayList<>();
        List<Integer> zcol = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zrow.add(i);
                    zcol.add(j);
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zrow.contains(i) || zcol.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}