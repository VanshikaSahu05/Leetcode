class Solution {
    class UnionFind
{
    int parent[];
    int rank[];

    UnionFind(int V) {
        parent = new int[V+1];
        rank = new int[V+1];

        for (int i = 0; i < V; i++) {
            parent[i]=i;
        }
    }

    int find(int node){
        if(parent[node]==node) return node;
        return find(parent[node]);
    }

    boolean union(int u,int v){
        int pu = find(u);
        int pv = find(v);

        if(pu==pv) return false;
        if(rank[pu]>rank[pv]){
            parent[pv]=pu;
        }
        else if(rank[pv]>rank[pu]){
            parent[pu]=pv;
        }
        else{
            parent[pv]=pu;
            rank[pu]++;
        }
        return true;
    }
    
}
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        UnionFind uf = new UnionFind(v);
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                if(isConnected[i][j]==1){
                    uf.union(i,j);
                }
            }
        }
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < v; i++) {
            hs.put(uf.find(i), hs.getOrDefault(uf.find(i), 0) + 1);
        }
        return hs.size();
    }
}