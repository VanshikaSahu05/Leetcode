class Solution {
    public static int helper(int[][] grid,int i,int j,int row,int col,int count,int obstacles){
        if(i>=row || i<0 || j>=col || j<0 || grid[i][j]==-1){
            return 0;
        }
        if(grid[i][j]==2){
            if(count == obstacles){
                return 1;
            }
            return 0;
        }
        grid[i][j] = -1;
        int[] r = {-1,0,1,0};
        int[] c = {0,1,0,-1};
        int num=0;
        for(int a=0;a<4;a++){
            num += helper(grid,i+r[a],j+c[a],row,col,count+1,obstacles);
        }
        grid[i][j]=0;
        return num;
    }
    public int uniquePathsIII(int[][] grid) {
        int obstacles = 1;
        int row = grid.length;
        int col = grid[0].length;
        int x =-1;
        int y =-1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==0){
                    obstacles++;
                }
                if(grid[i][j]==1){
                    x =i;
                    y=j;
                }

            }
        }
        return helper(grid,x,y,row,col,0,obstacles);
    }
}