class Solution {
    
    Set<List<Integer>> result = new HashSet<>();
    
    public List<List<Integer>> threeSum(int[] nums) {
    
        Arrays.sort(nums);
        for(int i=0; i <= nums.length-2; i++){
            int start = nums[i];
            int newTarget = -1 * start;

            int left = i+1;
            int right = nums.length-1;
            while(left < right) {
                if(nums[left] + nums[right] == newTarget){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);

                    left++;
                    right--;
                }
                else if(nums[left] + nums[right] > newTarget){
                    right--;
                }
                else if(nums[left] + nums[right] < newTarget){
                    left++;
                }
            }
        }
    
        return result.stream().collect(Collectors.toList());
    }
}