class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int row = image.length;
        int col = image[0].length;
        if(image[sr][sc] == color) return image;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { sr, sc });
        int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
        int sp = image[sr][sc];
        while (!q.isEmpty()) {
            int[] arr = q.poll();
            int r = arr[0];
            int c = arr[1];
            image[r][c] = color;
            for(int[] d:dirs){
                int nr = r+d[0];
                int nc = c+d[1];
                if(nr>=0 && nr<image.length && nc>=0 && nc<image[0].length && image[nr][nc]==sp){
                    image[nr][nc] = color;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return image;
    }
}