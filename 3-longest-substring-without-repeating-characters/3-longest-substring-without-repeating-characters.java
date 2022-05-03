class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() <= 1){
            return s.length();
        }
        
        int result = 0;
        Set<Character> hset = new HashSet<>();
        
        int left = 0;
        for(int r=0; r < s.length(); r++){
            
            while(hset.contains(s.charAt(r))){
                hset.remove(s.charAt(left));
                left += 1;
            }
            
            hset.add(s.charAt(r));
            result = Math.max(result, r-left+1);
        }
        
        return result;
    }
}