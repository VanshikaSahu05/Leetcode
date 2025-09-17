class Solution {
    public static int firstOcc(int[] nums,int target){
        int start = 0;
        int last = nums.length-1;
        int ans = nums.length;
        while(start<=last){
            int mid = (start+last)/2;
            if(nums[mid]>=target){
                ans = mid;
                last = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
      public static int lastOcc(int[] nums,int target){
        int start = 0;
        int last = nums.length-1;
        int ans = nums.length;
        while(start<=last){
            int mid = (start+last)/2;
            if(nums[mid]>target){
                ans = mid;
                last = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int firstocc = firstOcc(nums,target);
        int lastocc = lastOcc(nums,target);
        if(firstocc == nums.length || nums[firstocc]!=target){
            return new int[]{-1,-1};
        }
        return new int[]{firstocc,lastocc-1};
    }
}