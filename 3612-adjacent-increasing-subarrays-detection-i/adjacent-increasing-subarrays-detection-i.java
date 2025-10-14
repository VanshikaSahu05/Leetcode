class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int a) {
    int n = nums.size();
    if(n<2*a) return false;
    for(int i=0;i<=n-2*a;i++){
        boolean first = true;
        boolean second = true;
        for(int j=i;j<i+a-1;j++){
            if(!(nums.get(j)<nums.get(j+1))){
                first=false;
                break;
            }
        }
        for(int k=i+a;k<i+2*a-1;k++){
            if(!(nums.get(k)<nums.get(k+1))){
                second=false;
                break;
            }
        }
        if(first && second) return true;
    }
    return false;
    }
}