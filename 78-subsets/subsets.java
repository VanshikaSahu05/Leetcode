class Solution {
    public static void helper(int[] nums, List<List<Integer>> ans,List<Integer> ls,int ind){
        if(ind == nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[ind]);
        helper(nums,ans,ls,ind+1);
        ls.remove(ls.size()-1);
        helper(nums,ans,ls,ind+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(nums,ans,ls,0);
        return ans;
    }
}