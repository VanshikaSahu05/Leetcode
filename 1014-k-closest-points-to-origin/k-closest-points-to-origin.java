class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i=0;i<points.length;i++){
            int[] arr = points[i];
            int dis = arr[0]*arr[0] + arr[1]*arr[1];
            pq.add(new int[]{dis,i});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
           int[] ele = points[pq.poll()[1]];
           ans[i]= ele;
           i++;
        }
        return ans;
    }
}