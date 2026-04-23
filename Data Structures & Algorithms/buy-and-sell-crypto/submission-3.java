class Solution {
    public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int MaxProfit = 0;
        for(int i = 1 ; i <= prices.length - 1 ; i++)
        {
            int cost = prices[i] - minimum;
            MaxProfit = Math.max(cost , MaxProfit);
            minimum = Math.min(minimum , prices[i]);
        }
        return MaxProfit;
        
    }
}
