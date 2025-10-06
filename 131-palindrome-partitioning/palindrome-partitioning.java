class Solution {
    public static boolean isPalindrome(String str){
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        return str.equals(st.toString());

    }
    public static void helper(List<List<String>> ans,List<String> ls,String s ,int ind){
        if(ind == s.length()){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPalindrome(s.substring(ind,i+1))){
                ls.add(s.substring(ind,i+1));
                helper(ans,ls,s,i+1);
                ls.remove(ls.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> ls = new ArrayList<>();
        helper(ans,ls,s,0);
        return ans;
    }
}