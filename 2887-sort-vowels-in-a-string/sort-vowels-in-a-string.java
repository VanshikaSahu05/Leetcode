import java.util.*;

class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList(
            'A','E','I','O','U','a','e','i','o','u'
        ));
        
        ArrayList<Character> found = new ArrayList<>();
        
        // collect vowels
        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                found.add(s.charAt(i));
            }
        }
        
        // sort vowels
        Collections.sort(found);
        
        // rebuild string
        StringBuilder t = new StringBuilder();
        int a = 0; // index for sorted vowels
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.contains(c)) {
                t.append(found.get(a));
                a++;
            } else {
                t.append(c);
            }
        }
        
        return t.toString();
    }
}
