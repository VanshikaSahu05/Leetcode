class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        
        int lcsLen = lcs(word1, word2, n, m);
        int ans = 0;

        ans += n - lcsLen;
        ans += m - lcsLen;

        return ans;
    }

    private int lcs(String s1, String s2, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];

        for(int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        for(int i = 0; i < m + 1; i++) {
            dp[0][i] = 0;
        }

        for(int i = 1; i < n + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m]; 
    }
}