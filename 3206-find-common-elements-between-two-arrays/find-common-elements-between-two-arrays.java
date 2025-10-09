class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs1 = new HashMap<>();
        HashMap<Integer,Integer> hs2 = new HashMap<>();
        for(int i:nums1){
            hs1.put(i,hs1.getOrDefault(i,0)+1);
        }
         for(int i:nums2){
            hs2.put(i,hs2.getOrDefault(i,0)+1);
        }
        int ans1 = 0;
        int ans2 = 0;
        for(int i:hs1.keySet()){
            if(hs2.containsKey(i)){
                ans1+=hs1.get(i);
            }
        }
        for(int i:hs2.keySet()){
            if(hs1.containsKey(i)){
                ans2+=hs2.get(i);
            }
        }
        return new int[]{ans1,ans2};
    }
}