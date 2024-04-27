class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> res = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            int totalCandie = candies[i] + extraCandies;

            if (totalCandie < max) {
                res.add(false);
            } else {
                res.add(true);
            }
        }

        return res;
    }
}