class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int ans = Integer.MIN_VALUE;
        while(start<end){
            int hei = Math.min(height[start],height[end]);
            ans = Math.max(ans,hei*(end-start));
            if(height[start]>height[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }
}