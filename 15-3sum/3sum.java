class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int a = i + 1;
            int b = n - 1;
            while (a < b) {
                int sum = arr[i] + arr[a] + arr[b];
                if (sum < 0) {
                    a++;
                } else if (sum > 0) {
                    b--;
                } else {
                    List<Integer> ls = new ArrayList<>();
                    ls.add(arr[i]);
                    ls.add(arr[a]);
                    ls.add(arr[b]);
                    ans.add(ls);
                    a++;
                    b--;
                    while (a < b && arr[a] == arr[a - 1]) {
                        a++;
                    }
                    while (a < b && arr[b] == arr[b + 1]) {
                        b--;
                    }
                }
            }

        }
        return ans;
    }
}