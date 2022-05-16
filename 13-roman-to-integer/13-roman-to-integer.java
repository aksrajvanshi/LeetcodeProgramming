class Solution {
    public int romanToInt(String s) {
        Stack<Character> st = new Stack<>();
        int result = 0;
        Map<Character, Integer> charIntMap = new HashMap<>();
        charIntMap.put('I', 1);
        charIntMap.put('V', 5);
        charIntMap.put('X', 10);
        charIntMap.put('L', 50);
        charIntMap.put('C', 100);
        charIntMap.put('D', 500);
        charIntMap.put('M', 1000);
        
        for(int i=0; i < s.length(); i++){
            
            if(s.charAt(i) == 'V' || s.charAt(i) == 'X'){
                
                if(!st.isEmpty() && st.peek() == 'I'){
                    result -= charIntMap.get(st.peek());
                    result += (charIntMap.get(s.charAt(i))-charIntMap.get(st.peek()));
                    st.push(s.charAt(i));
                }
                else{
                    st.push(s.charAt(i));
                    result += charIntMap.get(s.charAt(i));
                }
            }
            else if(s.charAt(i) == 'L' || s.charAt(i) == 'C'){
                
                if(!st.isEmpty() && st.peek() == 'X'){
                    result -= charIntMap.get(st.peek());
                    result += (charIntMap.get(s.charAt(i))-charIntMap.get(st.peek()));
                    st.push(s.charAt(i));
                }
                else{
                    st.push(s.charAt(i));
                    result += charIntMap.get(s.charAt(i));
                }
                
            }
            else if(s.charAt(i) == 'D' || s.charAt(i) == 'M'){
                if(!st.isEmpty() && st.peek() == 'C'){
                    result -= charIntMap.get(st.peek());
                    result += (charIntMap.get(s.charAt(i))-charIntMap.get(st.peek()));
                    st.push(s.charAt(i));
                }
                else{
                    st.push(s.charAt(i));
                    result += charIntMap.get(s.charAt(i));
                }
            }
            else{
                st.push(s.charAt(i));
                result += charIntMap.get(s.charAt(i));
            }
            
            
        }
        
        return result;
    }
}