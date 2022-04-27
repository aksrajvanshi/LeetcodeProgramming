class Solution {
    List<int[]> res = new ArrayList<>();
    
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length == 0){
            return intervals;
        }
        
     	Arrays.sort(intervals, (i1, i2) -> i1[0]-i2[0]);
        int[] startInterval = intervals[0];
        
        for(int i=1; i < intervals.length; i++){
            if(startInterval[1] >= intervals[i][0]){
                startInterval[1] = Math.max(startInterval[1], intervals[i][1]);
            }
            else{
                res.add(startInterval);
                startInterval = intervals[i];
            }
        }
        
        if(!res.contains(startInterval)){
            res.add(startInterval);
        }
        
        return res.toArray(new int[res.size()][]);
    }
}