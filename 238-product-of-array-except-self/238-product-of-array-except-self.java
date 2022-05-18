class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] leftToRightProduct = new int[nums.length];
        leftToRightProduct[0] = nums[0];
        
        for(int i=1; i < nums.length; i++){
            leftToRightProduct[i] = nums[i] * leftToRightProduct[i-1];
        }
        
        int[] rightToLeftProduct = new int[nums.length];
        rightToLeftProduct[nums.length-1] = nums[nums.length-1];
        
        for(int j=nums.length-2; j >= 0; j--){
            rightToLeftProduct[j] = nums[j] * rightToLeftProduct[j+1];
        }
        
        int[] result = new int[nums.length];
        for(int k=0; k < nums.length; k++){
            if(k == 0){
                result[k] = rightToLeftProduct[k+1];
            }
            else if(k == nums.length-1){
                result[k] = leftToRightProduct[k-1];
            }
            else{
                result[k] = leftToRightProduct[k-1] * rightToLeftProduct[k+1];
            }
        }
        
        return result;
    }
}