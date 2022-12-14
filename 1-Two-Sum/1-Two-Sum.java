

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 0;
        boolean solutionFlag = false;
        int[] outputArray;
        for(i=0; i<nums.length-1; i++) {
            for(j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    solutionFlag = true; 
                    break;
                }
            }
            if (solutionFlag) {
                break;
            }
        }
        outputArray = new int[]{i,j};
        return outputArray;
    }
    
}
