class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-bestBuy;

            profit=Math.max(profit,cost);
            bestBuy=Math.min(bestBuy,prices[i]);
        }
        return profit;
    }
}