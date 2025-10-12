class Solution {
    public double myPow(double x, int n) {
        long binaryForm = n;
        if(n<0){
            x = 1/x;
            binaryForm = -1*binaryForm;
        }
        double ans = 1;
        double X = x;
        while(binaryForm>0){
            if(binaryForm%2!=0){
                ans *= X;
            }
            X *=X;
            binaryForm /=2;
        } 
        return ans;
    }
}