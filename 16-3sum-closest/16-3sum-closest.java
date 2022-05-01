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

            int left = i+1;
            int right = nums.length-1;
            
            while(left < right){
                
                int total = start + nums[left] + nums[right];
                int diff = Math.abs(target - total);
                
                if(total == target){
                    
                    if(diff < minDiff){
                        return total;
                    }
                }
                else if(total > target){

                    if(diff < minDiff){
                        minDiff = diff;
                        res = total;
                    }
                    right--;
                }
                else if(total < target){

                    if(diff < minDiff){
                        minDiff = diff;
                        res = total;
                    }
                    left++;
                }
                
            }
        }
    
        return res;
    }
}