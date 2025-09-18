class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i!=j && i<j){
                    int tem = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tem;
                }
            }
        }
        for(int i =0;i<matrix.length;i++){
            int a =0;
            int b=matrix[0].length-1;
            while(a<b){
                  int tem = matrix[i][a];
                    matrix[i][a] = matrix[i][b];
                    matrix[i][b] = tem;
                    a++;
                    b--;
            }
        }
    }
}