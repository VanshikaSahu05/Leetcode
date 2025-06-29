class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        int [][] array = new int[n/3][3];
        Arrays.sort(nums);
        int a=0;
        for(int i=0;i<n/3;i++){
            for(int j=0;j<3;j++){
                array[i][j]=nums[a];
                a++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i][2]-array[i][0]>k){
                return new int[0][0];
            }
            
        }
        return array;
    }
}