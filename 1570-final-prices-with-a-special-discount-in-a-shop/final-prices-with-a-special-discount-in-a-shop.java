class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[prices.length];
         Arrays.fill(ans, -1);
        for(int i=prices.length-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i] = prices[i];
                st.push(prices[i]);
            }
            else{
                if(st.peek()<=prices[i]){
                    ans[i] = prices[i]-st.peek();
                    st.push(prices[i]);

                }
                else{
                    while(!st.isEmpty()){
                        if(st.peek()>prices[i]){
                            st.pop();
                        }
                        else{
                            ans[i]=prices[i]-st.peek();
                            st.push(prices[i]);
                            break;
                        }
                    }
                    if(ans[i]==-1){
                        ans[i]=prices[i];
                        st.push(prices[i]);
                    }
                }
            }
        }
        return ans;
    }
}