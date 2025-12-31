class Solution {
    public long minimumSteps(String s) {
        int black = 0;
        int i=0;
        long ans =0;
        while(i<s.length()){
            if(s.charAt(i)=='1'){
                black++;
            }
            else{
                ans+=black;
            }
            i++;
        }
        return ans;
    }
}