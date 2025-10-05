class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left =0;
        int right =0;
        int count =0;
        int mul = 1;
        if(k<=1) return 0;
        while(right<nums.length){
            mul = mul*nums[right];
            while(mul>=k){
                mul = mul/nums[left];
                left++;
            }
            count += right-left+1;
            right++;
        }
        return count;
    }
}