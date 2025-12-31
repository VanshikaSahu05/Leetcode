class Solution {
    public boolean canTransform(String start, String result) {
        int n=start.length();
        int i=0;
        int j=0;
        while(i<n || j<n){
            while(i<n && start.charAt(i)=='X') i++;

            while(j<n && result.charAt(j)=='X') j++;

            if(i==n && j ==n) return true;

            if(i==n || j==n) return false;

            if(start.charAt(i) != result.charAt(j)) return false;

            if(start.charAt(i)=='L'){
                if(!(i>=j)){
                    return false;
                }
            }

            if(start.charAt(i)=='R'){
                if(!(i<=j)){
                    return false;
                }
            }
            i++;
            j++;
        }
        return true;
    }
}