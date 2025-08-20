class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
            else{
                if(!st1.isEmpty()) st1.pop();
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st2.push(t.charAt(i));
            }
            else{
               if(!st2.isEmpty()) st2.pop();
            }
        }
        if(st1.size()!=st2.size()) return false;
        while(!st1.isEmpty()){
            if(st1.pop()!=st2.pop()) return false;
        }
        return true;
    }
}