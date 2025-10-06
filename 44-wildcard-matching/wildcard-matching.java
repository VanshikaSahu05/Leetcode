class Solution {
    public boolean isMatch(String s, String p) {
        int pl = p.length();
        int sl = s.length();
        int[][] dp = new int[pl][sl];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return helper(s,p,pl-1,sl-1,dp);
    }
    public static boolean helper(String s,String p,int i,int j,int[][] dp){
        if(i<0 && j<0) return true;
        if(i<0 && j>=0) return false;
        if(i>=0 && j<0){
            for(int k=0;k<=i;k++){
                if(p.charAt(k)!='*') return false;
            }
            return true;
        }
        if(dp[i][j]!=-1) return dp[i][j] == 1;
        boolean ans;
        if(p.charAt(i)==s.charAt(j) || p.charAt(i)=='?'){
            ans = helper(s,p,i-1,j-1,dp);
        }
        else if(p.charAt(i)=='*'){
            boolean a = helper(s,p,i-1,j,dp);
            boolean b = helper(s,p,i,j-1,dp);
            ans = a||b;
        }
        else{
            ans = false;
        }
        dp[i][j] = ans?1:0;
        return ans;
    }
}