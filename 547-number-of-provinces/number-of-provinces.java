class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int vertex = isConnected.length;
        for(int i=0;i<vertex;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }
        int count=0;
        boolean[] visited = new boolean[vertex];
        for(int i=0;i<vertex;i++){
            if(visited[i]!=true){
                dfs(visited,graph,i);
                count++;
            }
        }
        return count;
    }
    public static void dfs(boolean[] visited,ArrayList<ArrayList<Integer>> graph,int node){
        visited[node]=true;
        for(int n:graph.get(node)){
            if(visited[n]!=true){
                dfs(visited,graph,n);
            }
        }
    }
}