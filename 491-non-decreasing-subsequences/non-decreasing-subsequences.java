class Solution {
    public static void helper(int[] nums,HashSet<List<Integer>> ans,List<Integer> ls,int pre,int curr){
        if(curr == nums.length){
            if(ls.size()>=2){
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(nums[curr]>=pre){
            ls.add(nums[curr]);
            helper(nums,ans,ls,nums[curr],curr+1);
            ls.remove(ls.size()-1);
        }
        helper(nums,ans,ls,pre,curr+1);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<Integer> ls = new ArrayList<>();

        helper(nums,ans,ls,Integer.MIN_VALUE,0);
        return new ArrayList<>(ans);
    }
}