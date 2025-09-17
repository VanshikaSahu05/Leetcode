class Solution {
    public int maxFreqSum(String s) {
        ArrayList<Character> ls = new ArrayList<>();
        ls.add('a');
        ls.add('e');
        ls.add('i');
        ls.add('o');
        ls.add('u');

        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        int vcount = 0;
        int ccount = 0;
        for(Map.Entry<Character,Integer> map : hs.entrySet()){
            Character c = map.getKey();
            if(ls.contains(c)){
                vcount=Math.max(vcount,map.getValue());
            }
            else{
                ccount = Math.max(ccount,map.getValue());
            }
        }
        return vcount+ccount;
    }
}