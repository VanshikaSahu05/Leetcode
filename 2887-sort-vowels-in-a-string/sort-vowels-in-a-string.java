class Solution {
    public String sortVowels(String s) {
      ArrayList<Character> ls = new ArrayList<>(Arrays.asList(
            'A','E','I','O','U','a','e','i','o','u'
        ));
        ArrayList<Character> ans = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(ls.contains(s.charAt(i))){
                ans.add(s.charAt(i));
            }
        }
        int a=0;
        String t = "";
        Collections.sort(ans);
        for(int i=0;i<s.length();i++){
            if(ls.contains(s.charAt(i))){
             t+=ans.get(a);
              a++;
            }
            else{
                t+=s.charAt(i);
            }
        }
        return t;
    }
}