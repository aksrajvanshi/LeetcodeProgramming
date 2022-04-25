class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] ans = new int[2];
        Map<Integer, Integer> hmap = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            
            if(!hmap.containsKey(nums[i])){
                hmap.put(nums[i], i);
            }
            
            if(hmap.containsKey(target - nums[i]) && i!= hmap.get(target-nums[i])){
                return new int[]{i, hmap.get(target-nums[i])};
            }
        }
        
        return ans;
    }
}