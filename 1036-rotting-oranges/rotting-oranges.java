class Solution {
    public int orangesRotting(int[][] grid) {
        // int n = grid.length;
        // int m = grid[0].length;
        // int fresh = 0;
        // Queue<int[]> queue = new LinkedList<>();
        // int[][]dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        // for(int i = 0 ; i < n ; i++){
        //     for(int j = 0 ; j < m ; j++){
        //         if(grid[i][j]==2){
        //             queue.add(new int[]{i,j,0});
        //         }
        //         else if(grid[i][j] == 1){
        //             fresh++;
        //         }
        //     }
        // }
        // int time = 0;
        // while(!queue.isEmpty()){
        //     int[]arr = queue.poll();
        //     int r = arr[0];
        //     int c = arr[1];
        //     int t = arr[2];
        //     time = Math.max(time , t);
        //     for(int[]d : dirs){
        //         int nr = r + d[0];
        //         int nc = c + d[1];
        //         if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
        //             grid[nr][nc] = 2;
        //             queue.add(new int[]{nr,  nc , t + 1});
        //             fresh--;
        //         }

        //     }
        // }
        // if(fresh > 0){
        //     return -1;
        // }
        // return time;

        int row = grid.length;
        int col = grid[0].length;
        int fresh =0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j, 0 });
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int time = 0;
        while(!q.isEmpty()){

           int[]arr = q.poll();
            int r = arr[0];
            int c = arr[1];
            int t = arr[2];
            time = Math.max(time,t);
            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                    q.add(new int[]{nr,nc,t+1});
                    grid[nr][nc] = 2;
                    fresh--;
                }
            }
        }
        if(fresh>0){
            return -1;
        }
        return time;
    }
}