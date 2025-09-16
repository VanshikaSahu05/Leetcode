class pair{
    int node;
    int weight;
    pair(int node,int weight){
        this.node = node;
        this.weight = weight;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] d:times){
            adj.get(d[0]).add(new pair(d[1],d[2]));
        }
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> a.weight-b.weight);
        pq.add(new pair(k,0));
        int[] dis = new int[n+1];
        Arrays.fill(dis,(int)1e9);
        dis[k] = 0;
        while(!pq.isEmpty()){
            pair p = pq.remove();
            int currnode = p.node;
            int currdis = p.weight;
            for(pair P:adj.get(currnode)){
                int neigh = P.node;
                int newdis = P.weight;
                if(dis[neigh]>dis[currnode]+newdis){
                    dis[neigh] = dis[currnode]+newdis;
                    pq.add(new pair(neigh,dis[neigh]));
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (dis[i] == (int)1e9) return -1;
            ans = Math.max(ans, dis[i]);
        }
        return ans;
    }

}