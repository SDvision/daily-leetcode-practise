class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minF = (nums.length/3) + 1;
        map.put(0, 0);
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<Integer> arr = new ArrayList<>();
        Set<Integer> keys = map.keySet();
        for (int key: keys) {
            if (map.get(key) >= minF) {
                arr.add(key);
            }
        }
        return arr;
    }
}