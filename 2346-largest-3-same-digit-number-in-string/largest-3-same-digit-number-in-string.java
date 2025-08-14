class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        int max = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                max = Math.max(max,num.charAt(i)-'0');
            }
        }
        if (max!=-1) {
            for (int i = 0; i < 3; i++) {
                ans += Integer.toString(max);
            }
        }
        return ans;
    }
}