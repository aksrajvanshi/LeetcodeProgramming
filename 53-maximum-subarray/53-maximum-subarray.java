class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxResult = nums[0];
        int currentScore = nums[0];
        
        for(int i=1; i < nums.length; i++){
            
            if((currentScore + nums[i]) < nums[i]){
                currentScore = nums[i];
            }
            else{
                currentScore += nums[i];
            }
            
            maxResult = Math.max(maxResult, currentScore);
        }
        
        return maxResult;
    }
}