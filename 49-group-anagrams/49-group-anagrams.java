class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs.length == 0){
            return new ArrayList<>();
        }
        
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for(String s : strs){
            
            char [] chArr = s.toCharArray();
            Arrays.sort(chArr);
            
            String sortedStr = String.valueOf(chArr);
            List<String> temp;
            if(!anagramMap.containsKey(sortedStr)){
                temp = new ArrayList<>();
                temp.add(s);
            }
            else{
                temp = anagramMap.get(sortedStr);
                temp.add(s);
            }
            
            anagramMap.put(sortedStr, temp);
        }
        
        List<List<String>> result = new ArrayList<>();
        
        for(Map.Entry<String, List<String>> entry : anagramMap.entrySet()){
            result.add(entry.getValue());
        }
        
        return result;
    }
}