class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> hs =  new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            hs.put(candyType[i],hs.getOrDefault(candyType[i],0)+1);
        }
        if(hs.size()>candyType.length/2){
            return candyType.length/2;
        }
        return hs.size();
    }
}