class Solution {
    public int maxProfit(int[] prices) {
        int max_Profit = 0;

        for(int i = 0; i < prices.length; i++)
        {
            for(int j = i + 1 ; j < prices.length; j++)
            {
                int profit = prices[j] - prices[i];
                max_Profit = Math.max(profit, max_Profit);
            }
        }
        return max_Profit;
        
    }
}
