class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDis = Integer.MAX_VALUE;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int a = i+1;
            int b= nums.length-1;
            while(a<b){
                int Sum = nums[i]+nums[a]+nums[b];
                int dis = Math.abs(Sum-target);
                if(dis<minDis){
                    sum = Sum;
                    minDis = dis;
                }
                if(Sum <= target){
                    a++;
                }
                else{
                    b--;
                }
            }
        }
        return sum;
    }
}