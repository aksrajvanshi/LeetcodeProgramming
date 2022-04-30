class Solution {
    public int maxArea(int[] height) {
        if(height.length < 2){
            return 0;
        }
        
        int left = 0;
        int right = height.length-1;
        int res = Integer.MIN_VALUE;
        /*
        
        it's a 2-pointer approach, where the lesser height endpoint is responsible for less water.
        Hence, we have left and right pointers at 0th and (height.length-1)th index. 
        
        if height of left index is smaller than height of larger index, we increment the left index, and vice-versa. 
        Calculate the area in every case and find the max of it.
        
        */
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