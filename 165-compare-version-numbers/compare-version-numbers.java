class Solution {
    public int compareVersion(String version1, String version2) {
        String[] c1 = version1.split("\\.");
        String[] c2 = version2.split("\\.");

        int i=0;
        while(i<c1.length || i<c2.length){
            int num1 = (i<c1.length)?Integer.parseInt(c1[i]):0;
            int num2 = (i<c2.length)?Integer.parseInt(c2[i]):0;
            if(num1>num2){
                return 1;
            }
            else if(num2>num1){
                return -1;
            }
            i++;
        }
        return 0;
    }
}