class Solution {
    public boolean canJump(int[] nums) {
        // here we check the maxjump at every index
        int maxInd = 0; // maxind to store the farthest index we can reach at any point. {ye bta rha ki max itne index tak aa skte hai kisi bhi point se}
        for(int i=0;i<nums.length;i++){
            if(i>maxInd) return false;
            maxInd = Math.max(maxInd,i+nums[i]);
            
        }
        return true;
    }
}