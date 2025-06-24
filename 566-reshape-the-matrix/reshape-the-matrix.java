class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n !=r*c){
            return mat;
        }
        int[][] ans = new int[r][c];
        int ansr=0;
        int ansc=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[ansr][ansc]=mat[i][j];
                ansc++;
                if(ansc==c){
                    ansc=0;
                    ansr++;
                }
            }
        }
        return ans;
    }
}