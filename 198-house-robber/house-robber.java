class Solution {
    public static int solve(int[] nums,int index,int[] dp){
        if(index>=nums.length){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }

        int steal = nums[index]+solve(nums,index+2,dp);
        int skip = solve(nums,index+1,dp);
        return dp[index]=Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
}
/*
class Solution {
    public static int solve(int[] arr,int index,int[] ans,int sum){
        if(index>=arr.length){
            ans[0] = Math.max(ans[0],sum);
            return ans[0];
        }
       solve(arr,index+2,ans,sum+arr[index]);
       solve(arr,index+1,ans,sum);
        return ans[0];
    }
    public int rob(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int[] a = new int[1];
            a[0] = Integer.MIN_VALUE;
            ans = Math.max(ans,solve(nums,i,a,0));
        }
        return ans;
    }
}
*/