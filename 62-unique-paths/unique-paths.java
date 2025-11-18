class Solution {
    public static int helper(int m,int n,int[][] dp){
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;

        if(dp[m][n] != -1) return dp[m][n];
        int up = helper(m-1,n,dp);
        int left = helper(m,n-1,dp);
        return dp[m][n] = up+left;
    }
    public int uniquePaths(int a, int b) {
        if(a== 1 && b==1 ) return 1;
        int[][] dp = new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                dp[i][j] = -1;
            }
        }
        helper(a-1,b-1,dp);
        return dp[a-1][b-1];
    }
}