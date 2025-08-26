class Pair {
    String st;

    int fre;

    Pair(String st, int fre) {
        this.st = st;
        this.fre = fre;

    }
}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hs = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            hs.put(words[i], hs.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.fre != b.fre ? a.fre - b.fre : b.st.compareTo(a.st));

        for (Map.Entry<String, Integer> e : hs.entrySet()) {
            pq.add(new Pair(e.getKey(), e.getValue()));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        ArrayList<String> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll().st);
        }
        Collections.reverse(ans);
        return ans;
    }
}