
// import java.util.Arrays;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int k = 0;
//         for(int i=0; i<nums.length; i++){
//             for(int j=1; j<nums.length; j++){
//                 if(nums[i]+nums[j]==target){
//                     int arr[k++] = i;
//                     arr[k] = j;
//                     break;
//                     }
//                 }
//         }

//         
//     }
//     
// }
// import java.util.Arrays;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         // int  k= 0;
//         int arr[] = new int[2];
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i]+nums[j]==target){
//                     arr[0] = i;
//                     arr[1] = j;
//                     return arr;
//                     }
//                 }
//             }
//     return arr;
//     }
// }
import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    l.add(i);
                    l.add(j);
                    }
            }
        }
        int[] arr= new int[l.size()];
        for(int k=0;k<l.size();k++){
            arr[k]=l.get(k);
        }
        return arr;
        
    }
}
