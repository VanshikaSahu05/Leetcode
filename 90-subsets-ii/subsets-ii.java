class Solution {
    public static void helper(List<List<Integer>> ans,List<Integer> ls,int[] nums,int ind){
        ans.add(new ArrayList<>(ls));
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;

            ls.add(nums[i]);
            helper(ans,ls,nums,i+1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,ls,nums,0);
        return ans;
    }
}