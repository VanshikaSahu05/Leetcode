class Solution {
    public static void helper(int[] arr,int target,List<List<Integer>> ans,List<Integer> ls,int ind){
        if(ind == arr.length){
            if(target == 0){
            ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(target>=arr[ind]){
        ls.add(arr[ind]);
        helper(arr,target-arr[ind],ans,ls,ind);
        ls.remove(ls.size()-1);
        }
        helper(arr,target,ans,ls,ind+1);
    }

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(arr, target, ans, ls, 0);
        return ans;
    }
}