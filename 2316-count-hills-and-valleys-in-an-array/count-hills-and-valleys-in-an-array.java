class Solution {
    public int countHillValley(int[] nums) {
        int ans=0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1]) continue;
            int left = 0;
            int right = 0;
            for (int a = i - 1; a >= 0; a--) {
                if (nums[a] != nums[i]) {
                    left=nums[a];
                    break;
                }
            }
            for(int b=i+1;b<nums.length;b++){
                if(nums[b]!=nums[i]){
                    right=nums[b];
                    break;
                }
            }
if (left != 0 && right != 0) {
    if ((left < nums[i] && right < nums[i]) || (left > nums[i] && right > nums[i])) {
        ans++;
    }
}

        }
        return ans;
    }
}