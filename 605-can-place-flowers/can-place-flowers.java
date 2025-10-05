class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int N = arr.length-1;
        if(n == 0){
            return true;
        }
        if(arr.length == 1 && arr[0] == 0 && n<=1){
            return true;
        }
        if(arr[0] == 0 && arr[1]==0){
            arr[0] =1;
            n--;
        }
        for(int i=1;i<arr.length-1;i++){
            if(n==0){
                return true;
            }
            if(arr[i] == 0 && arr[i-1] == 0 && arr[i+1] ==0){
                arr[i]=1;
                n--;
            }
            System.out.println(i);
        }
        System.out.println(n);
        if(n>0 && arr[N]==0 && arr[N-1]==0){
            arr[N] = 1;
            n--;
        }
        return n==0?true:false;
    }
}