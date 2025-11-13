class Solution {
    public static String reverse(String s){
        StringBuilder st = new StringBuilder(s);
        st.reverse();
        return st.toString();
    }
    public String reverseWords(String s) {
        String[] st = s.split(" ");
        for(int i=0;i<st.length;i++){
            st[i] = reverse(st[i]);
        }
        String ans ="";
        for(String str:st){
            ans+=str+" ";
        }
        return ans.trim();
    }
}