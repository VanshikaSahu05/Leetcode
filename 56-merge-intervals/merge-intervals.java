class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();

        for (int[] row : intervals) {
            list.add(row);
        }

        int i = 0;
        int j = 1;
        while (j < list.size()) {
            if (list.get(i)[1] >= list.get(j)[0]) {
                list.set(i, new int[] { list.get(i)[0], Math.max(list.get(j)[1],list.get(i)[1]) });
                list.remove(list.get(j));
            } else {
                i++;
                j++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}