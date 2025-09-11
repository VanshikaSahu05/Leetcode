class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int[] ans = new int[nums.length];
        int a = -1;
        while(!pq.isEmpty()){
            int alice = pq.poll();
            int bob = pq.poll();
            ans[++a] = bob;
            ans[++a] = alice;
        }
        return ans;
    }
}