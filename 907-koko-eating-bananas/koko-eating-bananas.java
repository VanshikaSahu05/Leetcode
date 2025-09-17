class Solution {
    public static long totalHour(int mid, int[] piles) {
        long hour = 0L;
        for (int i = 0; i < piles.length; i++) {
            hour += ((long)piles[i] + mid - 1) / mid;
        }
        return hour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxSpeed = Math.max(maxSpeed, piles[i]);
        }
        int minSpeed = 1;
        int fastSpeed = maxSpeed;
        int result = fastSpeed;
        while (minSpeed <= fastSpeed) {
            int mid = (minSpeed + fastSpeed) / 2;
            long hour = totalHour(mid, piles);
            if (hour <= h) {
                result = mid;
                fastSpeed = mid - 1;
            } else {
                minSpeed = mid + 1;
            }
        }
        return result;
    }
}