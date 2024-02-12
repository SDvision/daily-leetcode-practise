class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        map.put(-1, -1);
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int max = -1;
        Set<Integer> keys = map.keySet();
        for (int key: keys) {

            if (key % 2 == 0) {
                if ((map.get(key) == map.get(max)) && (key < max)) {
                    max = key;
                } else if (map.get(key) > map.get(max)) {
                    max = key;
                }

            }
        }
        return max;
    }
}