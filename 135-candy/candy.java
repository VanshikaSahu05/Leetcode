class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
         arr1[0] = 1;
         arr2[n-1] = 1;
        int min1 = 1;
        for(int i=0;i<n-1;i++){
            if(ratings[i]<ratings[i+1]){
                min1++;
            }
            else{
                min1 = 1;
            }
            arr1[i+1] = min1;
        }
        int min2 =1;
        for(int i=n-1;i>=1;i--){
            if(ratings[i]<ratings[i-1]){
                min2++;
            }
            else{
                min2 = 1;
            }
            arr2[i-1] = min2;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=Math.max(arr1[i],arr2[i]);
        }
        return sum;
    }
}