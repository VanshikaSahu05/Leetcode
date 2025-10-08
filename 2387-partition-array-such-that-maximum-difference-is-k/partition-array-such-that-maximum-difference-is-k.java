class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count=0;
        int i=0;
        while(i<n){
            count++;
            int start = nums[i];
            while(i<n && nums[i]<=start+k){
                i++;
            }
            
        }
        return count;
    }
}