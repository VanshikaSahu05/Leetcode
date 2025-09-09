class Solution {
    public static boolean dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int node,int parent){
        visited[node] = true;
        for(int d:adj.get(node)){
            if(!visited[d]){
                if(dfs(adj,visited,d,node)){
                    return true;
                }
            }
            else if(d!=parent){
                return true;
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int vertices = edges.length;
        for(int i=0;i<=vertices;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] d:edges){
            adj.get(d[0]).add(d[1]);
            adj.get(d[1]).add(d[0]);
            boolean[] visited = new boolean[vertices+1];
            if(dfs(adj,visited,d[0],-1)){
                return(d);
            }
        }
        int[] ans = new int[2];
        return ans;
    }
}