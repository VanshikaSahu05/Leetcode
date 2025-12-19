

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {

        Map<String, Integer> seen = new HashMap<>();

        while (N > 0) {

            String state = Arrays.toString(cells);

            if (seen.containsKey(state)) {
                int cycle = seen.get(state) - N;
                N %= cycle;
            }

            seen.put(state, N);

            if (N == 0) break;

            N--;

            int[] next = new int[8];
            for (int i = 1; i < 7; i++) {
                next[i] = (cells[i - 1] == cells[i + 1]) ? 1 : 0;
            }

            cells = next;
        }
        return cells;
    }
}
