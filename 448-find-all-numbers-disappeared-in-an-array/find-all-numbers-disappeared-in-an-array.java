class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int length = nums.length;
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=length;i++){
            if(!hs.containsKey(i)) ans.add(i);
        }
        return ans;
    }
}