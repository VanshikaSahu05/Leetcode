
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]==b[0]?b[1]-a[1]:b[0]-a[0]);
        for (int i = 0; i < arr.length; i++) {
            int d = Math.abs(x - arr[i]);
            pq.add(new int[]{d,arr[i]});
            if (pq.size() > k) {
                pq.poll();
            }
        }
        ArrayList<Integer> ls = new ArrayList<>();
        while (!pq.isEmpty()) {
            ls.add(pq.poll()[1]);
        }
        Collections.sort(ls);
        return ls;
    }
}