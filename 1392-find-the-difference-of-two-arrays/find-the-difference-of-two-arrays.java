class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            int a=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    a=1;
                    break;
                }
            }
            if(a==0 && !l1.contains(nums1[i])){

                l1.add(nums1[i]);
            }
            
        }
        for(int i=0;i<nums2.length;i++){
            int b=0;
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    b=1;
                    break;
                }
            }
            if(b==0 && !l2.contains(nums2[i])){
                l2.add(nums2[i]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}