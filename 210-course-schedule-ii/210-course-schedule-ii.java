class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        int[] indegree = new int[numCourses];
        int[][] grid = new int[numCourses][numCourses];
        Queue<Integer> q = new LinkedList<>();
        
        for(int[] edge: prerequisites){
            int source = edge[0];
            int dest = edge[1];
            indegree[dest]++;
            
            grid[source][dest] = 1;
        }
        
        
        for(int node=0; node < indegree.length; node++){
            if(indegree[node] == 0){
                q.add(node);
            }
        }
        
        if(q.isEmpty()){
            return new int[0];
        }
        
        List<Integer> topoSort = new ArrayList<>();
        
        while(!q.isEmpty()){
            
            int current = q.remove();
            topoSort.add(0, current);
            
            for(int rowIdx=0; rowIdx < grid[current].length; rowIdx++){
                if(current!= rowIdx && grid[current][rowIdx] == 1){
                    indegree[rowIdx]--;
                    
                    if(indegree[rowIdx] == 0){
                        q.add(rowIdx);
                    }
                }
            }
            
        }
        
        if(topoSort.size() != numCourses){
            return new int[0];
        }
        
        return topoSort.stream().mapToInt(i -> i).toArray();
        
    }
}