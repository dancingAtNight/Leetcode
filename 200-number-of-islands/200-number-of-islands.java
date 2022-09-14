class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    res++;
                    dfs(grid, i, j);

                }

            }
            
        }
        return res;
        
        
    }
    private static void dfs(char[][] grid, int i, int j){
        int m = grid.length, n = grid[0].length;
        if( i < 0 || j < 0 || i >= m || j >= n){
            return;
        }
        if(grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i+ 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i -1, j);
        dfs(grid, i, j-1);
    }
}