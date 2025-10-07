class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        for(int i=1;i<n;i++){
            int j=i-1;
            while(j>=0){
                if(nums[i]>nums[j]){
                    arr[i] = Math.max(arr[i],arr[j]+1);
                }
                j--;
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            ans = Math.max(ans,arr[i]);
        }
        return ans;
    }
}
/*
class Solution {
    public static void helper(int[] nums, ArrayList<Integer> ls,int curr,int prev,int[] ans){
        if(curr == nums.length){
            ans[0] = Math.max(ans[0],ls.size());
            return;
        }
        if(nums[curr]>prev){
            ls.add(nums[curr]);
            helper(nums,ls,curr+1,nums[curr],ans);
            ls.remove(ls.size()-1);
        }
        helper(nums,ls,curr+1,prev,ans);
    }
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        int[] ans = new int[1];
        helper(nums,ls,0,Integer.MIN_VALUE,ans);
        return ans[0];
    }
}
*/