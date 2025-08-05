class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        TreeMap<Integer,Long> hs = new TreeMap<>();
        for(int[] seg :segments){
            hs.put(seg[0],hs.getOrDefault(seg[0],0L)+seg[2]);
            hs.put(seg[1],hs.getOrDefault(seg[1],0L)-seg[2]);
        }
        List<List<Long>> ls = new ArrayList<>();
        Integer prev = null;
        long sum = 0;
        for(int points:hs.keySet()){
            if(prev!=null && sum!=0){
                ls.add(Arrays.asList((long)prev,(long)points,sum));
            }
            sum += hs.get(points);
            prev = points;
        }
        return ls;
    }
}