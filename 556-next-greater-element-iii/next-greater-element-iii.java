class Solution {
    public static String swap(int a,int b,String s){
        StringBuilder st = new StringBuilder(s);
        char i = st.charAt(a);
        st.setCharAt(a,s.charAt(b));
        st.setCharAt(b,i);
        return st.toString();
    }
    public static String reverse(int ind,String s){
        int i=ind;
        int j=s.length()-1;

        while(i<j){
            s=swap(i,j,s);
            i++;
            j--;
        }
        return s;
    }
    public int nextGreaterElement(int n) {
        String s = ""+n;
        int point = -1;
        for(int i=s.length()-2;i>=0;i--){
            if( s.charAt(i)-'0' < s.charAt(i+1)-'0' ){
                point=i;
                break;
            }
        }
        if(point == -1){
            return -1;
        }
        for(int a=s.length()-1;a>=point+1;a--){
            if(s.charAt(a)-'0' > s.charAt(point)-'0'){
                s = swap(a,point,s);
                break;
            }
        }
        s = reverse(point+1,s);
        long ans = Long.parseLong(s);
        return (ans > Integer.MAX_VALUE) ? -1 : (int) ans;
    }
}