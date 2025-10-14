class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        for(int i:nums){
            if(i<0){
                ls1.add(i);
            }
            else{
                ls2.add(i);
            }
        }
        int a =0 ;
        for(int i=0;i<ls1.size();i++){
            nums[a++]=ls2.get(i);
            nums[a++]=ls1.get(i);
        }
        return nums;
    }
}