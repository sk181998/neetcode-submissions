class Solution {
    public int maxProfit(int[] prices) {
        int minm = prices[0];//keep tracking of minm buy price.
        int profit = 0;
        for(int i = 1 ; i < prices.length ; i++ )
        {
            int cost = prices[i] - minm;
            profit = Math.max(profit , cost);
            minm = Math.min(minm , prices[i]);//maintaing the mimn price
        }
        return profit;

        
    }
}