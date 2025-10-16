class Solution {
    public String getHint(String secret, String guess) {
        int n= secret.length();
        boolean[] bull = new boolean[n+1];
        boolean[] cow = new boolean[n+1];

        int countBull = 0;
        int countCow = 0;
        for(int i=0;i<n;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                countBull++;
                bull[i]=true;
                cow[i]=true;
            }
        }
        for(int i=0;i<n;i++){
            if(bull[i]!=true){
                for(int j=0;j<n;j++){
                    if(secret.charAt(i)==guess.charAt(j) && bull[j]!=true && cow[j]==false){
                        countCow++;
                        cow[j]=true;
                        break;
                    }
                    
                }
            }
        }
        String res =countBull+"A"+countCow+"B";
        return res;
    }
}