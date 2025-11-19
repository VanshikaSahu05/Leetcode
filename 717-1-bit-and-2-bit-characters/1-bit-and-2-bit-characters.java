class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length){
            if(bits[i] == 1 ){
                if(i+1 < bits.length && (bits[i] == 1 || bits[i]==0)){
                    i+=2;
                }
                else{
                    return false;
                }
            }
            else{
                if(i == bits.length-1) return true;
                else i++;
            }
        }
        return false;
    }
}