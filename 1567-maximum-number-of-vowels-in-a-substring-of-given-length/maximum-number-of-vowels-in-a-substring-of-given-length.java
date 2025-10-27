class Solution {
    public int maxVowels(String s, int k) {
        String str = "aeiou";
        ArrayList<Character> ls = new ArrayList<>();
        for(int a=0;a<str.length();a++){
            ls.add(str.charAt(a));
        }
        int i=0;
        int j=0;
        int ans = Integer.MIN_VALUE;
        int vowel = 0;
        while(j<s.length()){
            if(ls.contains(s.charAt(j))){
                vowel++;
            }
            if(j-i+1 == k){
                ans = Math.max(ans,vowel);
                if(ls.contains(s.charAt(i))){
                    vowel--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}