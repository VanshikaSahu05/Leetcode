class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        int num=-1;
        for(Map.Entry<Integer,Integer> map : hs.entrySet()){
            if(map.getKey()==map.getValue()){
                num=Math.max(num,map.getKey());
            }
        }
        return num;
    }
}