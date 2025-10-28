class Solution {
    public static void swap(int[] nums,int even,int odd){
        int temp = nums[even];
        nums[even] = nums[odd];
        nums[odd] = temp;
    }
    public int[] sortArrayByParityII(int[] nums) {
        int even=0;
        int odd =1;
        while(even<nums.length && odd<nums.length){
            if(nums[even]%2==0){
                even +=2;
            }
            else if(nums[odd]%2!=0){
                odd += 2;
            }
            else if(nums[even]%2!=0 && nums[odd]%2==0){
                swap(nums,even,odd);
            }

        }
        return nums;
    }
}