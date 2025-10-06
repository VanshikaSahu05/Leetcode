class Solution {
    public static int helper(int i,int j,int[] nums){
        if(i>j) return 0;
        if(i==j) return nums[i];
        int takeI = nums[i] + Math.min(helper(i+2,j,nums),helper(i+1,j-1,nums));
        int takeJ = nums[j] + Math.min(helper(i+1,j-1,nums),helper(i,j-2,nums));
        return Math.max(takeI,takeJ);
    }
    public boolean predictTheWinner(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total +=nums[i];
        }
        int p1 = helper(0,nums.length-1,nums);
        int p2 = total - p1;
        return p1>=p2;
    }
}