class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        String ans = "";
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='6'){
                ans+='9';
                break;
            }
            else{
                ans+='9';
            }
            i++;
        }
        i+=1;
        while(i<s.length()){
            ans+=s.charAt(i);
            i++;
        }
        return Integer.parseInt(ans);
    }
}