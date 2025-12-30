class Solution {
    public static void dfs(boolean[][] visited,char[][] grid,int row,int col){
        visited[row][col]=true;
        int[] r ={0,-1,0,1};
        int[] c ={1,0,-1,0};
        for(int i=0;i<4;i++){
            int R=row+r[i];
            int C=col+c[i];
            if(R>=0 && R<grid.length && C>=0 && C<grid[0].length && grid[R][C]=='1' && visited[R][C]!=true){
                dfs(visited,grid,R,C);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count=0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] visited = new boolean[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                    dfs(visited,grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}