class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[j]!=nums[j-1]){
                nums[i] = nums[j-1];
                i++;
            }
            j++;
        }
        nums[i] = nums[nums.length-1];
        return i+1;
    }
}