class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] px = new int[arr.length];
        int[] sol = new int[queries.length];
        px[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            px[i] = px[i - 1] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            sol[i] = px[queries[i][1]] ^ px[queries[i][0]] ^ arr[queries[i][0]];
        }
        return sol;
    }
}