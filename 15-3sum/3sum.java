class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ls = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int third = -1*(nums[i]+nums[j]);
                if(hs.contains(third)){
                    List<Integer> subList = new ArrayList<>();
                    subList.add(nums[i]);
                    subList.add(nums[j]);
                    subList.add(third);
                    Collections.sort(subList);
                    ls.add(subList);
                }
                hs.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> i:ls){
            ans.add(i);
        }
        return ans;
    }
}