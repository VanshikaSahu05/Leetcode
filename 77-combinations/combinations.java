class Solution {
    public static void helper( List<List<Integer>> ans,List<Integer> ls ,int[] arr,int ind,int size){
        if(ind == arr.length){
            if(ls.size()==size){
                ans.add(new ArrayList<>(ls));
                
            }
            return;
        }
        ls.add(arr[ind]);
        helper(ans,ls,arr,ind+1,size);
        ls.remove(ls.size()-1);
        helper(ans,ls,arr,ind+1,size);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        helper(ans,ls,arr,0,k);
        return ans;
    }
}