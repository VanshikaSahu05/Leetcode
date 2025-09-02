class Solution {
    int[][]dirs = {{-1,0},{1,0},{0,1},{0,-1}};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == '1'){
                    dfs(grid , i , j);
                    count++;
                }
            }
        }
        return count;

    }
    public void dfs(char[][]grid , int r , int c ){
        grid[r][c] = '0';
        for(int[]d : dirs){
            int nr = r + d[0];
            int nc = c + d[1];
            if(nr>=0 && nr < grid.length && nc>=0 && nc < grid[0].length && grid[nr][nc] == '1'){
                dfs(grid , nr , nc);
            }
        }
    }
}