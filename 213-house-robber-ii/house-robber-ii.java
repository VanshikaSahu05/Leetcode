class Solution {
    public static int helper(int[] arr,int start,int end,int[] dp){
        if(start>end){
            return 0;
        }
        if(dp[start]!=-1) return dp[start];
        int pick = arr[start] + helper(arr,start+2,end,dp);
        int nonPick = 0+helper(arr,start+1,end,dp);
        return dp[start] = Math.max(pick,nonPick);
    }
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int ans1 = helper(nums,0,nums.length-2,dp1);
        int ans2 = helper(nums,1,nums.length-1,dp2);
        return Math.max(ans1,ans2);
    }
}
/*
class Solution {
    public static int helper(int[] arr,int[] max,int n,int start,int end){
        if(index == n-1){
            return max[n-2];
        }
        if(index == 0){
            max[index] = arr[index];
            helper(arr,max,n,index+1);
        }
        if(index == 1){
            max[index] = arr[index];
            helper(arr,max,n,index+1);
        }
        max[]
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] max1 = new int[n];
        int[] max2 = new int[n];
        return Math.max(helper(nums,max1,n,0,n-1),helper(nums,max2,n,1));
    }
}
*/