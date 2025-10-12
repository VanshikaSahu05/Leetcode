class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3){
            return 0;
        }
        int length = 0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                int a=i-1;
                int b=i+1;
                while(a>=0 && arr[a]<arr[a+1]){
                    a--;
                }
                while(b<arr.length && arr[b]<arr[b-1]){
                    b++;
                }
                length = Math.max(length,(b-1)-(a+1)+1);
            }
        }
        return length;
    }
}