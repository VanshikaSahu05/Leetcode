class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        String s = "";
        int count = 1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]==chars[i-1]){
                count++;
            }
            else{
                s+=chars[i-1];
                if(count!=1){
                    s+=count;
                }
                count=1;
            }
        }
        if(count!=1){
            s+=chars[n-1];
            s+=count;
        }
        else{
            s+=chars[n-1];
        }
        for(int i=0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
    }

}