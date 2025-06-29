class Solution {
    public static int sum(int[] nums){
        int Sum = 0;
        for(int num:nums){
            Sum+=num;
        }
        return Sum;
    }
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int neg=0;
        int zero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]<0){
                neg++;
            }
            else{
                break;
            }
        }
        for(int i=0;i<neg && k>0 ;i++,k--){
            nums[i] *=-1;
        }
        Arrays.sort(nums);
        if(zero>0 && k>0){
            return sum(nums);
        }
        while(k>0){
            nums[0] *= -1;
            k--;
        }
        return sum(nums);

    }
}