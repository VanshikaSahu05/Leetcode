class Solution {
    public int nthUglyNumber(int n) {
        HashSet<Long> ls = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>((a,b) -> Long.compare(a,b));
        pq.add(1L);
        ls.add(1L);
        int[] arr = {2,3,5};
        long num = 1;
        for(int j=0;j<n;j++){
            num = pq.poll();
            for(int i=0;i<3;i++){
                if(!ls.contains(num*arr[i])){
                ls.add(num*arr[i]);
                pq.add(num*arr[i]);
                }
            }
        }
        return (int)num;
    }
}