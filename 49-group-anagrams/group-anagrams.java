class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s: strs) {
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            String ss = new String(sChars);
            if (map.containsKey(ss)) {
                map.get(ss).add(s);
            } else {
                map.put(ss, new ArrayList<>(Arrays.asList(s)));
            }
        }
        
        Set<String> set = map.keySet();
        for (String s: set) {
            result.add(map.get(s));
        }
        return result;
    }
}