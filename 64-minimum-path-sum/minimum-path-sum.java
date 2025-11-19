class Solution {
    public static int helper(int i,int j , int[][] grid,int[][] dp){
        if(i==0 && j==0){
            return grid[0][0];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE / 2;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int up = grid[i][j] + helper(i-1,j,grid,dp);
        int left = grid[i][j] + helper(i,j-1,grid,dp);

        return dp[i][j] = Math.min(up,left); 
    }
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dp[i][j] = -1;
            }
        }
        return helper(row-1,col-1,grid,dp);
    }
}