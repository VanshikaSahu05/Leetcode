class Solution {
    public int getLucky(String s, int k) {
        StringBuilder st = new StringBuilder();
        for (char ch : s.toCharArray()) {
            st.append(ch - 'a' + 1);
        }
        String number = st.toString();
        while (k-- > 0) {
            int sum = 0;
            for (char ch : number.toCharArray()) {
                sum += ch-'0';
            }
            number = Integer.toString(sum);
        }
        return Integer.parseInt(number);
    }
}