class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE;
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0;i<strs.length-1;i++){
            String s1 = strs[i];
            String s2 = strs[i+1];
            int len = Math.min(s1.length(),s2.length());
            int count=0;
            for(int j=0;j<len;j++){
                if(s1.charAt(j)==s2.charAt(j)){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count!=0){
                min = Math.min(min,count);
            }
            else{
                return "";
            }
        }
        return strs[0].substring(0,min);
    }
}