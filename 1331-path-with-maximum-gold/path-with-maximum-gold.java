class Solution {
    public static int dfs(int[][] grid, int i ,int j,int row,int col){
        if(i>=row || i<0 || j>=col || j<0 || grid[i][j]==0) return 0;

        int originalvalue = grid[i][j];
        grid[i][j] = 0;
        
        int maxGold = Integer.MIN_VALUE;
        int[] r ={0,0,-1,1};
        int[] c ={-1,1,0,0};
        for(int a=0;a<4;a++){
            maxGold= Math.max(maxGold,dfs(grid,i+r[a],j+c[a],row,col));
        }
        grid[i][j] = originalvalue;
        return originalvalue+maxGold;
    }
    public int getMaximumGold(int[][] grid) {
        int m =grid.length;
        int n =grid[0].length;
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    ans = Math.max(ans,dfs(grid,i,j,m,n));
                }
            }
        }
        return ans;
    }
}