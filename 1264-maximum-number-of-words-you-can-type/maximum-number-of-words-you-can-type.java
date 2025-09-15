class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        ArrayList<Character> ls = new ArrayList<>();
        for(int i =0 ;i<brokenLetters.length();i++){
            ls.add(brokenLetters.charAt(i));
        }
        int count=0;
        
        String[] str = text.split(" ");
        for(int i=0;i<str.length;i++){
            boolean flag = false;
            String s = str[i];
            for(int j=0;j<s.length();j++){
                if(ls.contains(s.charAt(j))){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                count++;
            }
        }
        return count;
    }
}