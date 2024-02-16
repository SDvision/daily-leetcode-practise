class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for (String s: sentences) {
            String[] arr = s.split(" ");
            int size = arr.length;
            if (max < size) {
                max = size;
            }
        }
        return max;
    }
}