//  The array is sorted except for one exception, where the order is violated exactly once arr[i-1]>arr[i]
// If an array is rotated (either left or right), nums[0] >= nums[nums.length - 1] will always hold.
// If an array is NOT rotated (fully sorted), then nums[0] < nums[nums.length - 1].

// class Solution {
//     public boolean check(int[] nums) {
//         int count=0;
//         int n=nums.length;
//         for(int i=1;i<n;i++){
//             if(nums[i-1]>nums[i]){
//                 count++;
//             }
//         }
//         /*The loop in the code already counts the number of violations (where nums[i-1] > nums[i]), but this extra condition helps handle cases where the array is not rotated but sorted.*/
//         if(nums[0]<nums[n-1]){
//             count++;
//         }
//         return count<=1;
//     }
// }

class Solution {
    public boolean check(int[] arr) {
        int index = -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
            index = i;
            break;
            }
        }
        if(index == -1) return true;

        if(arr[0]<arr[arr.length-1]) return false;

        for(int i=0;i<index;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        for(int i=index+1;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}