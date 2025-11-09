class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
                int a =j+1;
                HashSet<Long> hs = new HashSet<>();
                while(a<nums.length){
                    long sum3 = (long) nums[i] + nums[j] + nums[a];
                    long needed = (long) target - sum3;

                    if (hs.contains(needed)) {
                        List<Integer> ls = Arrays.asList(nums[i], nums[j], nums[a], (int) needed);
                        Collections.sort(ls);
                        ans.add(ls);
                    }

                    hs.add((long)nums[a]);
                    a++;
                }
            }
        }
        return new ArrayList<>(ans);
    }
}