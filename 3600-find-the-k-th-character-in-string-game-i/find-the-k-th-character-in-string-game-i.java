class Solution {
    public char kthCharacter(int k) {
        StringBuilder st = new StringBuilder("a");
        while(st.length()<k){
            String s = "";
            for(int i=0;i<st.length();i++){
                s+=(char)((int)st.charAt(i)+1);
            }
           st.append(s);
        }
        return st.charAt(k-1);
    }
}