class Solution {
    public static boolean isSorted(int[] num,int size){
        for(int i=0;i<size-1;i++){
            if(num[i]>num[i+1]) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        int count = 0;
        int size = nums.length;
        if(size<=0){
            return count;
        }

        while (!isSorted(nums,size)) {
            count++;
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int i = 0; i < size-1; i++) {
                int curMin = nums[i] + nums[i + 1];
                if (curMin < min) {
                    min = curMin;
                    minIdx = i;
                }
            }
            nums[minIdx] = min;
            for (int i = minIdx + 1; i < size-1; i++) {
                nums[i] = nums[i + 1];
            }
            size--;
        }
        return count;
    }
}