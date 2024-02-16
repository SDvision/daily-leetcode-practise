class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        if (arr.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        
        List<Integer> freq = new ArrayList<>();
        for (int value: map.values()) {
            freq.add(value);
        }

        Collections.sort(freq);
        int removed = 0;
        for (int i = 0; i < freq.size(); i++) {
            if (k >= freq.get(i)) {
                k -= freq.get(i);
                removed++;
            }
        }

        return freq.size() - removed;

    }
}