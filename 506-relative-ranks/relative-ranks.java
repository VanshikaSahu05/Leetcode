class Solution {
    public String[] findRelativeRanks(int[] score) {
        ArrayList<Integer> ls = new ArrayList<>();

        String[] ans = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for(int i:score){
            pq.add(i);
            ls.add(i);
        }
        String[] medal = {"Gold Medal","Silver Medal","Bronze Medal"};
        for(int i=0;i<3;i++){
            if(!pq.isEmpty()){
            int index = ls.indexOf(pq.poll());
            ans[index] = medal[i];
            }
        }
        int inc = 3;
        while(!pq.isEmpty()){
            int index =ls.indexOf(pq.poll());
            ans[index] = inc+1 +"";
            inc++; 
        }
        return ans;
    }
}