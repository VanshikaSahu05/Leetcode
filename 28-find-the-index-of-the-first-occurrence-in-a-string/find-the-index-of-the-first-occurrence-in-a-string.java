class Solution {
    public int strStr(String s2, String s1) {
        int lengthS1 = s1.length();
        TreeMap<Character,Integer> hs = new TreeMap<>();
        for(int i=0;i<s1.length();i++){
            hs.put(s1.charAt(i),hs.getOrDefault(s1.charAt(i),0)+1);
        }
        int i=0;
        int j=0;
        while(j<s2.length()){
            char c = s2.charAt(j);
            if(hs.containsKey(c)){
                hs.put(c,hs.get(c)-1);
            }
            if(j-i+1 == lengthS1){
                if(check(hs)){
                    String s = s2.substring(i,j+1);
                    if(s.equals(s1)) return i;
                    
                }
                char C = s2.charAt(i);
                if(hs.containsKey(C)){
                    hs.put(C,hs.get(C)+1);
                }
                i++;
            }
            j++;
        }
        return -1;
    }
    public static boolean check(TreeMap<Character,Integer> hs){
        for(Character c:hs.keySet()){
            if(hs.get(c)!=0){
                return false;
            }
        }
        return true;
        
    }
}