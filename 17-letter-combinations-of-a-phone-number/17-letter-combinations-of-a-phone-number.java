class Solution {
    
    String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    Set<String> result;
    
    public List<String> letterCombinations(String digits) {
        
        result = new HashSet<>();
        
        if(digits.length() == 0){
            return result.stream().collect(Collectors.toList());
        }
        
        generateCombinations(digits, "", 0);
        
        return result.stream().collect(Collectors.toList());
    }
    
    public void generateCombinations(String digits, String temp, int idx){
        
        if(digits.length() == temp.length()){
            result.add(temp);
            return;
        }
        
        int digit = Integer.parseInt(""+digits.charAt(idx));
        
        for(int j=0; j < letters[digit].length(); j++){
            generateCombinations(digits, temp + letters[digit].charAt(j) + "", idx+1);
        }
        
        
    }
    
}