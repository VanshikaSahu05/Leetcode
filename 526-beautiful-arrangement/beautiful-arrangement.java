class Solution {
    public int countArrangement(int n) {
        boolean[] flag = new boolean[n+1];
        return solve(1,n,flag);
    }
    public static int solve(int p,int n,boolean[] flag){
        if(p>n){
            return 1;
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(!flag[i] && (p%i==0 || i%p==0)){
                flag[i] = true;
                count+=solve(p+1,n,flag);
                flag[i] = false;
            }
        }
        return count;
    }
}