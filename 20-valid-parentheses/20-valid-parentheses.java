class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 == 1){
            return false;
        }
        
        Stack<Character> st = new Stack<>();
        Map<Character, Character> hmap = new HashMap<>();
        
        hmap.put(')','(');
        hmap.put(']','[');
        hmap.put('}','{');
        
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(hmap.get(s.charAt(i)).equals(st.peek())){
                    st.pop();
                }
                else{
                    return false;
                }
                
            }
        }
        
        return st.size() == 0;
    }
}