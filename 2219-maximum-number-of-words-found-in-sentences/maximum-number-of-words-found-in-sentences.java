class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for (String s: sentences) {
            String[] arr = s.split(" ");
            if (max < arr.length) {
                max = arr.length;
            }
        }
        return max;
    }
}