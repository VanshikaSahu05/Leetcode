class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustIn = new int[n+1];
        int[] trustOut = new int[n+1];
        for(int[] i:trust){
            trustIn[i[0]] = i[1];
            trustOut[i[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(trustOut[i]==n-1 && trustIn[i]==0){
                return i;
            }
        }
        return -1;
    }
}