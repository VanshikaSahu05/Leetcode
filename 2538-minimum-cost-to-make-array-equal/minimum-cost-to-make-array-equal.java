class Solution {
    public long minCost(int[] nums, int[] cost) {
        ArrayList<int[]> ls = new ArrayList<>();
        int n = nums.length;
        long totalCost = 0;

        for(int i=0;i<n;i++){
            totalCost +=cost[i];
            ls.add(new int[]{nums[i],cost[i]});
        }
        ls.sort((a,b) -> Integer.compare(a[0],b[0]));
        long[] pre = new long[n];
        long prev = 0;
        int ind =0;
        for(int[] a:ls){
            prev+=a[1];
            pre[ind++] = prev;
        }
        long x = -1;
        for(int i=0;i<n;i++){
            if(pre[i]>totalCost/2){
                x = ls.get(i)[0];
                break;
            }
        }
        long ans = 0;
        for(int i=0;i<n;i++){
            ans += Math.abs(nums[i]-x)*cost[i];
        }
        return ans;
    }
}