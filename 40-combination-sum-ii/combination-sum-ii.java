class Solution {
    public static void helper(int[] arr,int target,List<List<Integer>> ans,List<Integer> ls,int ind){
            if(target==0){
                ans.add(new ArrayList<>(ls));
                return;
            }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
                ls.add(arr[i]);
                helper(arr,target-arr[i],ans,ls,i+1);
                ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(arr,target,ans,ls,0);
        return ans;
    }
}