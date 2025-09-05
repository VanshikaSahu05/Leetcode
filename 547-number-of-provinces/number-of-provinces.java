class Solution {
    public static void dfs(int[][] isConnected,boolean[] visited,int node){
        visited[node] = true;
        for(int j=0;j<isConnected[node-1].length;j++){
            if(isConnected[node-1][j] == 1 && !visited[j+1]){
                dfs(isConnected,visited,j+1);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length+1];
        int count=0;
        for(int i=1;i<=isConnected.length;i++){
            if(visited[i]==false){
                dfs(isConnected,visited,i);
                count++;
            }
        }
        return count;
    }
}