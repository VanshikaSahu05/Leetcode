class Solution {
    public int integerReplacement(int N) {
        long n = N;
        int ans = 0 ;
        while(n!=1){
            if(n%2 == 0){
                ans++;
                n /=2;
            }
            else{
                if(n==3){
                    ans+=2;
                    break;
                }
                else if(((n-1)/2)%2 == 0){
                    ans ++;
                    n-=1;
                }
                else{
                    ans++;
                    n+=1;
                }
            }
        }
        return ans;
    }
}