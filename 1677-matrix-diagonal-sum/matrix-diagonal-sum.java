class Solution {
    public int diagonalSum(int[][] mat) {
        int pSum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(i==j){
                    pSum+=mat[i][j];
                }
            }
        }
        int sSum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=mat.length-1;j>=0;j--){
                if(i+j == mat[0].length-1){
                   sSum+=mat[i][j];
                }
            }
        }
        if(mat.length%2 == 0){
            return pSum+sSum;
        }
        return pSum+sSum-mat[mat.length/2][mat.length/2];
    }
}