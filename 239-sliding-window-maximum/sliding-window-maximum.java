class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            // step 1: check for window size(can't be greater than k)
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            // step 2: check the coming ele from back of deque
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }

            dq.addLast(i);

            if(i>=k-1){
                ls.add(nums[dq.peekFirst()]);
            }
        }
        int a =0;
        int[] ans = new int[ls.size()];
        for(int i:ls){
            ans[a++] = i;
        }
        return ans;
    }
}