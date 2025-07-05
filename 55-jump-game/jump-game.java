class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int currentEle = nums[0];
        if(currentEle==0){
            return false;
        }
        for(int i=0;i<nums.length;i++){
            currentEle--;
            if(currentEle<nums[i]){
                currentEle=nums[i];
            }
            else if(currentEle==0 && i!=nums.length-1){
                return false;
            }
        }
        return true;
    }
}