class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String i:operations){
            if(i.equals("C")) st.pop();
            else if(i.equals("D")) st.push(2*st.peek());
            else if(i.equals("+")){
                int top = st.pop();
                int newTop = top+st.peek();
                st.push(top);
                st.push(newTop);
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        int sum = 0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}