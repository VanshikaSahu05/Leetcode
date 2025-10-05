class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int Max = Integer.MIN_VALUE;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum = nums[i]+nums[j];
            Max = Math.max(Max,sum);
            i++;
            j--;
        }
        return Max;
    }
}