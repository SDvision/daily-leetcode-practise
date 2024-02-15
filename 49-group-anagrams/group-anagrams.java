class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
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
        
        return new ArrayList<>(map.values());
    }
}