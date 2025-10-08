class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] arrLeft = new int[n];
        int[] arrRight = new int[n];
        int left=0;
        int right=0;
        for(int i=0;i<n;i++){
            arrLeft[i] = left;
            left+=nums[i];
        }
         for(int i=n-1;i>=0;i--){
            arrRight[i] = right;
            right+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(arrLeft[i]==arrRight[i]) return i;
        }
        return -1;
    }
}