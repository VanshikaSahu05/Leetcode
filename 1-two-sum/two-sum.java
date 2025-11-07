class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int tar = target - nums[i];
            if(hs.containsKey(tar)){
                return new int[]{hs.get(tar),i};
            }
            else{
                hs.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}