class Solution {
    public int maximumUnits(int[][] arr, int t) {
        Arrays.sort(arr,(a,b) -> (a[1]==b[1]) ? (b[0]-a[0]) : (b[1]-a[1]) );
        int ans =0 ;
        int ind =0;
        while(ind < arr.length && t>0 ){
           if(arr[ind][0]<=t){
             ans += (arr[ind][0]*arr[ind][1]);
            t = t-arr[ind][0];
            ind++;
           }
           else{
            ans +=(t*arr[ind][1]);
            t=0;
            ind++;
           }
           
        }
        return ans;
    }
}