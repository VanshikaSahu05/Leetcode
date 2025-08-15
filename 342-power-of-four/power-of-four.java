class Solution {
    public static boolean helper(int n){
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        
        return helper(n/4);
        
    }
    public boolean isPowerOfFour(int n) {
        return helper(n);
    }
}