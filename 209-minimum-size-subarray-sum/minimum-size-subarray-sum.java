class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                min = Math.min(min,j-i+1);
                    sum-=nums[i];
                    i++;
                    flag = true;
                }
                
                j++;
            }
            if(flag == false){
                return 0;
            }
        return min;
    }
}