class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n=nums.length;
       for(int i=0;i<nums.length;i++){
        if(Math.abs(nums[i]-nums[(i+1)%n])>ans){
            ans=Math.abs(nums[i]-nums[(i+1)%n]);
        }
       }
       return ans;
    }
}