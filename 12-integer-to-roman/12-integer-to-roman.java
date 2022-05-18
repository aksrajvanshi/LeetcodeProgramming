class Solution {
    public String intToRoman(int num) {
        
        String[] symbol = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] value = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        
        int idx = value.length-1;
        StringBuilder result = new StringBuilder();
        
        while(num > 0){
            
            while(num >= value[idx]){
                result.append(symbol[idx]);
                num -= value[idx];
            }
            
            idx--;
        }
        
        return result.toString();
    }
}