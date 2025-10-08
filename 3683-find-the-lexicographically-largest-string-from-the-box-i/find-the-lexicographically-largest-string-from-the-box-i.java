class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1) return word;
        ArrayList<String> ls = new ArrayList<>();

        int longestPossible = word.length() - (numFriends-1);

        for(int i=0;i<word.length();i++){
            int cantake = Math.min(word.length(),longestPossible+i);
            ls.add(word.substring(i,cantake));
        }
        Collections.sort(ls);
        return ls.get(ls.size()-1);
    }
}