class Solution {
    public static void helper(List<String> ls,int n,String s,int open,int close){
        if(open == n && close ==n){
            ls.add(s);
            return;
        }
        if(open<n){
            helper(ls,n,s+"(",open+1,close);
        }
        if(close<open){
            helper(ls,n,s+")",open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        helper(ls,n,"",0,0);
        return ls;
    }
}