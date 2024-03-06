class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num)+1);
            }
        }
        Set<Integer> keys = map.keySet();
        for (Integer key: keys) {
            if (map.get(key) == 1) {
                return key;
            }           
        }
        return -1;
    }
}