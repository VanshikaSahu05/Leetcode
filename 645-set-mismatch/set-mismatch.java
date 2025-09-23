class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        int sum = 0;
        int repaeat = 0;
        for(Map.Entry<Integer,Integer> map :hs.entrySet()){
            sum+=map.getKey();
            if(map.getValue()==2){
                repaeat = map.getKey();
            }
        }
        return new int[]{repaeat,(n*(n+1))/2-sum};
    }
}