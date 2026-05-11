class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = 1;
        int maximumProfit = 0;
        while(end < prices.length)
        {
            if(prices[start] < prices[end])
            {
                int profit = prices[end] - prices[start];
                maximumProfit = Math.max(maximumProfit , profit);
            }
            else
            {
                start = end;
            }
            end++;
        }
        return maximumProfit;  
    }
}
