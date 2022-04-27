class Solution {
    
    int longestPalStringLength = 0;
    int startIdx = 0;
    
    public String longestPalindrome(String s) {
        if(s.length() == 1){
        	return s;
        }
        
        for(int i=s.length()-1; i >= 0; i--){
        	findLongestPalindome(s, i, i);
            findLongestPalindome(s, i, i+1);	
        }
        
        return s.substring(startIdx, startIdx + longestPalStringLength);
    }
    
    public void findLongestPalindome(String s, int start, int end){
    	
        while(start >= 0 && end <= s.length()-1 && s.charAt(start) == s.charAt(end)){
        	start--;
            end++;
        }
        
        if(end-start-1 > longestPalStringLength){
        	startIdx = start+1;
            longestPalStringLength = end-start-1;
        }
    }
}