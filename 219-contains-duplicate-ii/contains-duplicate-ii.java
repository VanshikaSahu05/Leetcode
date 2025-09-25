class Solution {
    public static void indOf(ArrayList<Integer> ls, int num, int[] arr) {
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] == num) {
                ls.add(n);
            }
        }
    }

    public static boolean check(ArrayList<Integer> ls, int k) {
        for(int i=0;i<ls.size()-1;i++){
            for(int j=i+1;j<ls.size();j++){
                if(Math.abs(ls.get(i)-ls.get(j))<=k) return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 1) {
            return false;
        }
        boolean ans = false;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i : nums) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> map : hs.entrySet()) {
            int N = map.getValue();
            int M = map.getKey();
            ArrayList<Integer> ls = new ArrayList<>();
            if (N >= 2) {
                indOf(ls, M, nums);
                ans = check(ls, k);
                if (ans) {
                    return true;
                }
                ls.clear();
            }
        }
        return false;
    }
}