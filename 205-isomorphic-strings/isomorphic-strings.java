class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,HashSet<Character>> hs1 = new HashMap<>();
        HashMap<Character,HashSet<Character>> hs2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char S = s.charAt(i);
            char T = t.charAt(i);
            if(hs1.containsKey(S)){
                hs1.get(S).add(T);
            }
            else{
                HashSet<Character> newHs1 = new HashSet<>();
                newHs1.add(T);
                hs1.put(S,newHs1);
            }
        }
        for(int i=0;i<s.length();i++){
            char S = s.charAt(i);
            char T = t.charAt(i);
            if(hs2.containsKey(T)){
                hs2.get(T).add(S);
            }
            else{
                HashSet<Character> newHs2 = new HashSet<>();
                newHs2.add(S);
                hs2.put(T,newHs2);
            }
        }
        if(hs1.size()!=hs2.size()) return false;
            
        boolean ans1 = true, ans2 = true;
        for(Character c:hs1.keySet()){
            if(hs1.get(c).size()>1) ans1 = false;
        }
        for(Character c:hs2.keySet()){
            if(hs2.get(c).size()>1) ans2 = false;
        }
        return (ans1 && ans2);
    }
}
/*
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        TreeMap<Character, Integer> hs1 = new TreeMap<>();
        TreeMap<Character, Integer> hs2 = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            hs1.put(s.charAt(i), hs1.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            hs2.put(t.charAt(i), hs2.getOrDefault(t.charAt(i), 0) + 1);
        }
        if (hs1.size() != hs2.size()) {
            return false;
        }
        Collection<Integer> values1 = hs1.values();
        Collection<Integer> values2 = hs2.values();
        for(int i=0;i<values1.length;i++){
            if(values1[i]!=values2[i]){
                return false;
            }
        }
        return true;
    }
}
*/