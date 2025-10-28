class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        ArrayList<int[]> ls = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            int[] arr1 = nums1[i];
            int[] arr2 = nums2[j];
            if(arr1[0]==arr2[0]){
                ls.add(new int[]{arr1[0],arr1[1]+arr2[1]});
                i++;
                j++;
            }
            else if(arr1[0]<arr2[0]){
                ls.add(new int[]{arr1[0],arr1[1]});
                i++;
            }
            else{
                ls.add(new int[]{arr2[0],arr2[1]});
                j++;
            }
        }

        while(i<nums1.length){
            int[] arr = nums1[i];
            ls.add(new int[]{arr[0],arr[1]});
            i++;
        }
        while(j<nums2.length){
            int[] arr = nums2[j];
            ls.add(new int[]{arr[0],arr[1]});
            j++;
        }
        int[][] ans = new int[ls.size()][2];
        int ind = 0;
        for(int[] a:ls){
            ans[ind] = a;
            ind++;
        }
        return ans;
    }
}