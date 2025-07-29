class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        int count=0;
        int temp=n;
        while(temp>0){
            temp/=2;
            count++;
        }
        int num = 1<<count;
        return n^(num-1);
    }
}