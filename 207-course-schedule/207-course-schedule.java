class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        int[] indegree = new int[numCourses];
        int[][] grid = new int[numCourses][numCourses];
        for(int[] edge: prerequisites){
            int source = edge[0];
            int dest = edge[1];
            indegree[dest]++;
            
            grid[source][dest] = 1;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int node=0; node < indegree.length; node++){
            if(indegree[node] == 0){
                q.add(node);
            }
        }
        
        if(q.isEmpty()){
            return false;
        }
        
        List<Integer> topoSort = new ArrayList<>();
        
        while(!q.isEmpty()){
            
            int current = q.remove();
            topoSort.add(current);
            
            for(int rowIdx=0; rowIdx < grid[current].length; rowIdx++){
                if(current!= rowIdx && grid[current][rowIdx] == 1){
                    indegree[rowIdx]--;
                    
                    if(indegree[rowIdx] == 0){
                        q.add(rowIdx);
                    }
                }
            }
            
        }
        
        return topoSort.size() == numCourses;
    }
}