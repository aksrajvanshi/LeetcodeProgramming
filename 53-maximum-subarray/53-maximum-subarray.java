class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxResult = nums[0];
        int currentScore = nums[0];
        
        for(int i=1; i < nums.length; i++){
            
            int newScore = currentScore + nums[i];
            
            if(newScore < nums[i]){
                currentScore = nums[i];
            }
            else{
                currentScore = newScore;
            }
            
            maxResult = Math.max(maxResult, currentScore);
        }
        
        return maxResult;
    }
}