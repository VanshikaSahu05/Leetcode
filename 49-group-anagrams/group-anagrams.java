class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap();
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = Arrays.toString(c);
            if(!hs.containsKey(s)){
                hs.put(s,new ArrayList<>());
            }
            hs.get(s).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> map:hs.entrySet()){
            ans.add(map.getValue());
        }
        return ans;
    }
}