class Solution {
    public int[] getOrder(int[][] tasks) {
        ArrayList<int[]> ls = new ArrayList<>();
        for(int i=0;i<tasks.length;i++){
            int starttime = tasks[i][0];
            int endtime = tasks[i][1];
            ls.add(new int[]{starttime,endtime,i});
        }
        ls.sort((a,b) -> Integer.compare(a[0],b[0]));
        PriorityQueue<int[]> pq  = new PriorityQueue<>((a,b) -> (a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]));
        int timer = ls.get(0)[0];
        int i=0;
        int n = tasks.length;
        int[] ans = new int[n];
        int ind = 0;

        while(i<n || !pq.isEmpty()){
            while( i<n && ls.get(i)[0]<=timer){
                pq.add(new int[]{ls.get(i)[1],ls.get(i)[2]});
                i++;
            }
            if(pq.isEmpty()){
                timer=ls.get(i)[0];
            }
            else{
                int[] arr = pq.remove();
                 ans[ind++] = arr[1];
                 timer+=arr[0];
            }
        }
        return ans;
    }
}