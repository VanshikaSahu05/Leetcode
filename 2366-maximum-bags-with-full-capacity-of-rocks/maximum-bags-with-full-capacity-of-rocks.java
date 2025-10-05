class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        long requiredStone = 0;
        int n = capacity.length;
        int[] required = new int[n];
        for(int i=0;i<n;i++){
            int diff = capacity[i]-rocks[i];
            requiredStone+=diff;
            required[i] =diff;
        }
        
        if(requiredStone<=additionalRocks){
            return n;
        }
        Arrays.sort(required);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (additionalRocks < required[i]) break;
            additionalRocks -= required[i];
            ans++;
        }

        return ans;
    }
}