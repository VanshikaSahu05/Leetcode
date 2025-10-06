// class Solution {
//     public static void Helper(int[] nums , List<List<Integer>> ls,ArrayList<Integer> h,boolean[] fre){
//         if(h.size()==nums.length){
//             ls.add(new ArrayList<>(h));
//             return;
//         }
//         for(int i=0;i<nums.length;i++){
//             // if fre[i] is false (!fre[i] mean true) to if condition chala do
//             // it show ki ele is not picked 
//             // if fre[i] is true (!fre[i] mean false) to if condition nhi chalao
//             // it show ki ele is picked 
//             if(!fre[i]){
//                 fre[i]=true;
//                 h.add(nums[i]);
//                 Helper(nums,ls,h,fre);
//                 h.remove(h.size()-1);
//                 fre[i]=false;
//             }
//         }
//     }
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ls = new ArrayList<>();
//         ArrayList<Integer> h = new ArrayList<>();
//         // this is for check that the element is picked or not
//         boolean[] fre = new boolean[nums.length];
//         Helper(nums,ls,h,fre);
//         return ls;
        
//     }
// }

//  ANOTHER METHOD 


class Solution {
    public static void Helper(List<List<Integer>> ls ,int[] arr,int index){
       if(index==arr.length){
        ArrayList<Integer> a=new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            a.add(arr[j]);
        }
        ls.add(new ArrayList<>(a));
        return;
       }
       for(int i=index;i<arr.length;i++){
        swap(index,i,arr);
        Helper(ls,arr,index+1);
        swap(index,i,arr);
       }
    }
    public static void swap(int i,int index,int[] nums){
        int temp=nums[i];
        nums[i]=nums[index];
        nums[index]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Helper(ls,nums,0);
        return ls;
    }

}