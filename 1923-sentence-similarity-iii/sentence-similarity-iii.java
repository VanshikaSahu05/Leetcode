class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {
        // first match suffix
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        int i1=0;
        int i2=0;
        while(i1<str1.length && i2<str2.length && str1[i1].equals(str2[i2])){
            i1++;
            i2++;
        }
        int j1=str1.length-1;
        int j2=str2.length-1;
        while(j1>=i1 && j2>=i2 && str1[j1].equals(str2[j2])){
            j1--;
            j2--;
        }
        return (i1>j1 || i2>j2);
    }
}