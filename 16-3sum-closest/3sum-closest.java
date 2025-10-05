class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i <= n - 3; i++) {
            int a = i + 1;
            int b = n - 1;
            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                if (target >= sum) {
                    a++;
                } else {
                    b--;
                }
                if (min > Math.abs(target - sum)) {
                    ans = sum;
                    min = Math.abs(target - sum);
                }
            }
        }
        return ans;
    }
}