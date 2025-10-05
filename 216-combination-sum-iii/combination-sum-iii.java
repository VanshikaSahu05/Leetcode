class Solution {
    public static void helper(List<List<Integer>> ans,List<Integer> ls,int[] arr,int ind,int target,int size){
        if(ind == arr.length){
            if(target == 0 && ls.size()==size){
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(target>=arr[ind]){
            ls.add(arr[ind]);
            helper(ans,ls,arr,ind+1,target-arr[ind],size);
            ls.remove(ls.size()-1);
        }
        helper(ans,ls,arr,ind+1,target,size);
        
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(ans,ls,arr,0,n,k);
        return ans;
    }
}