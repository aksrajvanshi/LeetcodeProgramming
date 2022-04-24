class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 == 1){
            return false;
        }
        
        Stack<Character> st = new Stack<>();
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            
            if(st.isEmpty()){
                if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']'){
                    return false;
                }
            }
            else{
                if(s.charAt(i) == ')'){
                    if(st.peek() == '('){
                        st.pop();
                    } else{
                        return false;
                    }
                }
                
                if(s.charAt(i) == '}'){
                    if(st.peek() == '{'){
                        st.pop();
                    } else {
                        return false;
                    }
                }
                
                if(s.charAt(i) == ']'){
                    if(st.peek() == '['){
                        st.pop();
                    } else{
                        return false;
                    }
                }
            }
        }
        
        return st.size() == 0;
    }
}