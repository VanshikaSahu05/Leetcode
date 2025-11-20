class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] arrl=new int[n];
        int[] arrr=new int[n];
        arrl[0]=height[0];
        for(int i=1;i<n;i++){
            arrl[i]=Math.max(height[i],arrl[i-1]);
        }
        arrr[n-1]=height[n-1];
        for(int j=n-2;j>=0;j--){
            arrr[j]=Math.max(height[j],arrr[j+1]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.max(0,(Math.min(arrl[i],arrr[i])-height[i]));
        }
        return ans;
    }
}