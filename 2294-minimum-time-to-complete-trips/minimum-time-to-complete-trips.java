class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long minTime = Integer.MAX_VALUE;
        int n = time.length;
        for(int i=0;i<n;i++){
            minTime = Math.min(minTime,time[i]);
        }
        long start=1;
        long end = minTime*totalTrips;
        long ans = 0;
        while(start<=end){
            long mid = start+(end-start)/2;
            long trip = check(time,mid);
            if(trip>=totalTrips){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    public static long check(int[] arr,long time){
        long totalTrip = 0;
        for(int i:arr){
            totalTrip += time/i;
        }
        return totalTrip;
    }
}