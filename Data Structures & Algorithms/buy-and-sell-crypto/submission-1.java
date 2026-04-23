class Solution {
    public int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        int MaxProfit = 0;
        for(int buy = 0 ; buy < prices.length - 1 ; buy++)
        {
            for(int sell = buy + 1 ; sell <= prices.length - 1 ; sell++)
            {
                profit = prices[sell] - prices[buy];
                if(MaxProfit < 0)
                {
                    MaxProfit = 0;
                }
                MaxProfit = Math.max(profit , MaxProfit);
            }
        }
        return MaxProfit;
        
    }
}
