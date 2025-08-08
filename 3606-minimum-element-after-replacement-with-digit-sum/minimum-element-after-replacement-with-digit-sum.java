class Solution {
    public static int sum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int minimum = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            minimum = Math.min(minimum,sum(nums[i]));
        }
        return minimum;
    }
}