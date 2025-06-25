class Solution {
    
    public static void leftArray(int[] leftarray,int[] seat){
        int last =-1;
        for(int i=0;i<seat.length;i++){
            if(seat[i]==1){
                last=i;
                leftarray[i]=i;
            }
            else{
                leftarray[i] = (last==-1)?Integer.MAX_VALUE:last;
            }
        }
    }
     public static void rightArray(int[] rightarray,int[] seat){
        int last =-1;
        for(int i=seat.length-1;i>=0;i--){
            if(seat[i]==1){
                last=i;
                rightarray[i]=i;
            }
            else{
                rightarray[i] = (last==-1)?Integer.MAX_VALUE:last;
            }
        }
    }
    public int maxDistToClosest(int[] seats) {
        int n=seats.length;
        int[] leftarray = new int[n];
        int [] rightarray = new int[n];
        leftArray(leftarray,seats);
        rightArray(rightarray,seats);
        
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<seats.length;i++){
            if(seats[i]!=1){
                int mindis = Math.min(Math.abs(leftarray[i]-i),Math.abs(rightarray[i]-i));
                ans = Math.max(ans,mindis);
            }
        }
        return ans;
    }
}
/*
public static void leftArray(int[] leftarray,int[] seat,int index){
        leftarray[index] = Integer.MAX_VALUE;
        for (int i = index - 1; i >= 0; i--) {
            if (seat[i] == 1) {
                leftarray[index] = i;
                break;
            }
        }
    }
public static void rightArray(int[] rightarray,int[] seat,int index){
        rightarray[index] = Integer.MAX_VALUE;
        for (int i = index + 1; i < seat.length; i++) {
            if (seat[i] == 1) {
                rightarray[index] = i;
                break;
            }
        }
    }
 */