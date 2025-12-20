class Solution {
    public static boolean check(String a, String b)
    {
        int m=a.length();
        int n=b.length();
        
        for(int i=0;i<=m-n;i++)
        {
            int j;
            for(j=0;j<n;j++){
                if(a.charAt(i+j)!=b.charAt(j))
                    break;
            }
            if(j==n)
                return true;
        }
        return false;
    }

    public int repeatedStringMatch(String a, String b) {
        int m = a.length();
        int n = b.length();

        int ans = 1;
        String tmp = a;
        while (a.length() < b.length()) {
            a += tmp;
            ans++;
        }

        if (check(a, b)) {
            return ans;
        }
        a += tmp;
        if (check(a, b)) {
            return ans + 1;
        }
        return -1;
    }
}