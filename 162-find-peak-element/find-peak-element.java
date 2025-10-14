class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(arr.length == 1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i;
        }
        return -1;
    }
}
/*
int n=arr.length;
int ans=0;
for(int i=0;i<n;i++){
    if((i==0 || arr[i-1]<arr[i]) && (i==n-1 || arr[i+1]<arr[i])){
        ans=i;
    }
}
*/
