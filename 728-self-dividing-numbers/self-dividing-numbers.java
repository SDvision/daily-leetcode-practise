class Solution {
    boolean checkIfSDN(int num) {
        int temp = num;
        while (temp > 0) {
            int bit = temp % 10;
            if (bit == 0 || num % bit != 0) {
                return false;
            }
            temp = temp / 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (checkIfSDN(i)) {
                list.add(i);
            }    
        } 
        return list;       
    }
}