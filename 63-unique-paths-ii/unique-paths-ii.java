class Solution {
    public static int helper(int m,int n,int[][] grid,int[][] dp){
        if(m==0 && n==0 ){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(grid[m][n]==1){
            return 0;
        }
        if(dp[m][n] !=-1 ) return dp[m][n];
        int up = helper(m-1,n,grid,dp);
        int left = helper(m,n-1,grid,dp);
        return dp[m][n] = up+left;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dp[i][j] = -1;
            }
        }
        if(grid[0][0] == 1 || grid[row-1][col-1]==1) return 0;
        return helper(row-1,col-1,grid,dp);
    }
}