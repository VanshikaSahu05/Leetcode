class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));
        int[] prevBallon=points[0];
        int count=1;
        for(int i=1;i<points.length;i++){
            int[] currentBallon = points[i];
            if(currentBallon[0]<=prevBallon[1]){
                prevBallon[0] = Math.max(prevBallon[0],currentBallon[0]);
                prevBallon[1] = Math.min(prevBallon[1],currentBallon[1]);
            }
            else{
                count+=1;
                prevBallon = currentBallon;
            }
            
        }
        return count;
    }
}