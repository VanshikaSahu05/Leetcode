class Solution {
    public boolean canJump(int[] nums) {
        // here we check the maxjump at every index
        int maxInd = 0;
        for(int i=0;i<nums.length;i++){
            if(maxInd<i) return false;
            maxInd = Math.max(maxInd,i+nums[i]);
            
        }
        return true;
    }
}