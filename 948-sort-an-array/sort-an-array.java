class Solution {
    public static void mergesort(int[] arr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[arr.length];
        int index =0 ;
        int i = low;
        int j = mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[index++] = arr[i];
                i++;

            }
            else{
                temp[index++] = arr[j];
                j++;
            }
        }
        while(i<=mid){
            temp[index++] = arr[i];
            i++;
        }
        while(j<=high){
            temp[index++] = arr[j];
            j++;
        }
        for(int a=low;a<=high;a++){
            arr[a] = temp[a-low];
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}

/*
bubble sort
class Solution {
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] sortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            boolean flag = false;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    swap(j,j-1,nums);
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
        return nums;
    }
}

// selection sort
class Solution {
    public static int min(int start,int end,int[] arr){
        int m = Integer.MAX_VALUE;
        int a = -1;
        for(int i=start;i<end;i++){
            if(arr[i]<m){
                a = i;
                m = arr[i];
            }
        }
        return a;
    }
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] sortArray(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            int minIndex = min(i,nums.length,nums);
            swap(minIndex,index,nums);
            index++;
        }
        return nums;
    }
}
*/