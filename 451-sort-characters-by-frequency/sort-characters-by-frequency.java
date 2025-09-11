class pair{
    int count;
    char c;
    pair(int count,char c){
        this.count = count;
        this.c = c;
    } 
}
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hs = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>((a,b) -> b.count-a.count);
        for(Map.Entry<Character,Integer> e:hs.entrySet()){
            pq.add(new pair(e.getValue(),e.getKey()));
        }
        String ans = "";
        while(!pq.isEmpty()){
            pair p = pq.poll();
            int occ = p.count;
            char ch = p.c;
            for(int i=0;i<occ;i++){
                ans+=ch;
            }

        }
        return ans;
    }
}