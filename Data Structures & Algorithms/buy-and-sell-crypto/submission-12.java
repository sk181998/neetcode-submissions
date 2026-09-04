class Solution {
    public int maxProfit(int[] prices) {
        int min_Price = Integer.MAX_VALUE;
        int max_Profit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < min_Price)
            {
                min_Price = prices[i];//10//1
            }
            else if(prices[i] - min_Price > max_Profit)
            {
                max_Profit = prices[i] - min_Price;
            }
            
        }
        return max_Profit;
    }
}
