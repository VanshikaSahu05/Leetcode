class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int num:stones){
            ls.add(num);
        }
        if(ls.size()==1){
            return ls.get(0);
        }
        while(ls.size()>1){
            Collections.sort(ls);
            int large = ls.get(ls.size()-1);
            ls.remove(ls.size()-1);
            int small = ls.get(ls.size()-1);
            ls.remove(ls.size()-1);
            if(large!=small){
                ls.add(large-small);
            }
        }
        return ls.isEmpty()?0:ls.get(0);
    }
}