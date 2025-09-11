class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer,Integer> hs = new HashMap<>();
        // PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1]-b[1]);
        // for(int i=0;i<nums.length;i++){
        //     hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> e:hs.entrySet()){
        //     pq.add(new int[]{e.getKey(),e.getValue()});
        //     if(pq.size()>k){
        //         pq.poll();
        //     }
        // }
        // int[] arr = new int[k];
        // int i=0;
        
        // while(!pq.isEmpty()){
        //     arr[i] = pq.poll()[0];
        //     i++;
        // }
        
        // return arr;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        for(Map.Entry<Integer,Integer> e:hs.entrySet()){
            pq.add(new int[]{e.getValue(),e.getKey()});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ans = new int[k];
        int a = 0;
        while(!pq.isEmpty()){
            ans[a] = (pq.poll()[1]);
            a++;
        }
        return ans;
    }
}