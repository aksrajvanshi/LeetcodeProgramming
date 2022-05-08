class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid.length == 0){
            return 0;
        }
        
        int row = grid.length;
        int col = grid[0].length;
        
        int[][] visited = new int[row][col];
        
        int islands = 0;
        
        for(int i=0; i < grid.length; i++){
            for(int j=0; j < grid[i].length; j++){
                
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    islands++;
                    dfs(grid, visited, i, j, row, col);
                }
                
                visited[i][j] = 1;
            }
        }
        
        return islands;
    }
    
    public void dfs(char[][] grid, int[][] visited, int i, int j, int row, int col){
        
        if(i < 0 || j < 0 || i > row-1 || j > col-1 || visited[i][j] == 1 || grid[i][j] == '0'){
            return;
        }
        
        
        visited[i][j] = 1;
        
        dfs(grid, visited, i+1, j, row, col);
        dfs(grid, visited, i-1, j, row, col);
        dfs(grid, visited, i, j+1, row, col);
        dfs(grid, visited, i, j-1, row, col);
        
    }
    
}