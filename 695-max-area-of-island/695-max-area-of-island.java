class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea, dfs(grid, i, j));
                }

            }
        }
        return maxArea;
        
    }
    private static int dfs(int[][] grid, int i, int j){
        //终止条件
        int m = grid.length, n = grid[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n){
            return 0;
        }
        if(grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        area += dfs(grid, i +1, j);
        area += dfs(grid, i-1, j);
        area += dfs(grid, i, j +1);
        area += dfs(grid, i, j-1);
        
        return area;

    }
}