class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                carry=0;
                break;
            }
            else{
                digits[i]=0;
                carry=1;
            }
        }
        if(carry!=0){
            int[] ans = new int[digits.length+1];
            ans[0]=1;
            return ans;
        }
        return digits;
    }
}