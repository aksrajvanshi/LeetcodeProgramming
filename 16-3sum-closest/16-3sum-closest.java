class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        if(nums.length < 3){
            return 0;
        }
        
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        int res = 0;
        for(int i=0; i <= nums.length-2; i++){
            int start = nums[i];

            for(int j=i+1; j < nums.length-1; j++){
                for(int k=j+1; k < nums.length; k++){
                    int total = start + nums[j] + nums[k];
                    int diff = Math.abs(target - total);
                    // System.out.println(start + " -- " + nums[j] + " -- " + nums[k] + " -- diff::" + diff);
                    if(diff < minDiff){
                        minDiff = diff;
                        res = total;
                    }
                }
            }
        }
    
        return res;
    }
}