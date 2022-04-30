class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2){
            return 0;
        }
        
        int left = 0;
        int right = height.length-1;
        int res = Integer.MIN_VALUE;
        
        while(left < right){
            
            int area = Math.min(height[left], height[right]) * (right-left);
            if(height[left] <= height[right]){
                left++;
            }
            else{
                right--;
            }
            
            res = Math.max(res, area);
        }
        
        return res;
    }
}