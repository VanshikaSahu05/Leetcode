class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                ls.add(i);
            }
        }
            ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<ls.size();j++){
                if(Math.abs(i-ls.get(j))<=k){
                    ans.add(i);
                    break;
                }
            }
            
        }
        return ans;
    }
}