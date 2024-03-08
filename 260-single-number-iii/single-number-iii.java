class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }
        
        int xt = nums[0];

        for (int i = 1; i < nums.length; i++) {
            xt = xt ^ nums[i];
        }

        int setBit = 0;
        while (true) {
            if ((xt & 1) == 0) {
                xt>>=1;
                setBit++;
                continue;
            }
            break;
        }
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i]; 
            if (((num>>=setBit) & 1) == 0) {
                s1.add(nums[i]);
            } else {
                s2.add(nums[i]);
            }
        }

        int res1 = s1.get(0);
        for (int i = 1; i < s1.size(); i++) {
            res1 = res1^s1.get(i); 
        }
        int res2 = s2.get(0);
        for (int i = 1; i < s2.size(); i++) {
            res2 = res2^s2.get(i); 
        }

        return new int[]{res1, res2};
    }
}