class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int s3 = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<s3){
                return true;
            }
            while(!st.isEmpty() && st.peek()<nums[i]){
                s3 = st.peek();
                st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}