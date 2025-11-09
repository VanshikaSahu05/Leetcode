class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int a=i+1;
            int b=nums.length-1;
            while(a<b){
                if(nums[i]+nums[a]+nums[b] == 0){
                    ArrayList<Integer> ls = new ArrayList<>();
                    ls.add(nums[i]);
                    ls.add(nums[a]);
                    ls.add(nums[b]);
                    Collections.sort(ls);
                    ans.add(ls);
                    a++;
                }
                else if(nums[i]+nums[a]+nums[b] > 0){
                    b--;
                }
                else{
                    a++;
                }
            }
        }
        List<List<Integer>> ls = new ArrayList<>();
        for(List<Integer> l:ans){
            ls.add(l);
        }
        return ls;
    }
}
/*
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ls = new HashSet<>();
        for(int i=0;i<=nums.length-3;i++){
            HashMap<Integer,Integer> hs = new HashMap<>();
            int n= nums[i];
            for(int j=i+1;j<nums.length;j++){
                int num = -1*(n+nums[j]);
                if(hs.containsKey(num)){
                    List<Integer> ans = new ArrayList<>();
                    ans.add(n);
                    ans.add(num);
                    ans.add(nums[j]);
                    Collections.sort(ans);
                    ls.add(ans);
                }
                hs.put(nums[j],j);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> l:ls){
            ans.add(l);
        }
        return ans;
    }
}
*/
