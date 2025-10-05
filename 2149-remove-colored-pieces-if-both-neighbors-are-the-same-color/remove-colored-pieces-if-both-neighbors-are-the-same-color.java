class Solution {
    public boolean winnerOfGame(String color) {
        int alice =0 ;
        int bob =0;
        char[] colors = color.toCharArray();
        for(int i = 1;i<colors.length-1;i++){
            if(colors[i]==colors[i-1] && colors[i]==colors[i+1]){
                if(colors[i]=='A') alice++;
                else bob++;
            }
        }
    return alice>bob;
    }
}

/*

Scan through the string (colors).
Whenever you find a continuous block of the same color:
Count its length → let’s call it len.
If len >= 3:
If color == 'A' → aliceMoves += (len - 2)
If color == 'B' → bobMoves += (len - 2)
After the loop:
If aliceMoves > bobMoves → return true (Alice wins)
Else → return false (Bob wins)


class Solution {
    public boolean winnerOfGame(String colors) {
        int aliceMoves = 0;
        int bobMoves = 0;
        int n = colors.length();

        // Start scanning through the string
        for (int i = 0; i < n;) {
            char c = colors.charAt(i);
            int j = i;

            // Count length of this same-color block
            while (j < n && colors.charAt(j) == c) {
                j++;
            }

            int len = j - i;

            // If the block length >= 3, add (len - 2) to respective player
            if (len >= 3) {
                if (c == 'A') {
                    aliceMoves += (len - 2);
                } else {
                    bobMoves += (len - 2);
                }
            }

            // Move to next block
            i = j;
        }

        // Alice wins if she has more possible moves than Bob
        return aliceMoves > bobMoves;
    }
}

 */