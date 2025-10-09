class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();

        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for(int i=0;i<n;i++){
            if(hs1.contains(nums[i])){
                arr1[i] = hs1.size();
            }
            else{
                hs1.add(nums[i]);
                arr1[i] = hs1.size();
            }
        }
        for(int i=n-1;i>=0;i--){
            if(hs2.contains(nums[i])){
                arr2[i] = hs2.size();
            }
            else{
                arr2[i] = hs2.size();
                hs2.add(nums[i]);
            }
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = arr1[i]-arr2[i];
        }
        return ans;
    }
}