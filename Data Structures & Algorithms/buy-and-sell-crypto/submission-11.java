class Solution {
    public int maxProfit(int[] prices) {
        int max_Profit = 0;
        int p1 = 0;
        int p2 = 1;

        while(p2 < prices.length)//n
        {
            if(prices[p2] >= prices[p1])
            {
                max_Profit = Math.max(max_Profit, prices[p2] - prices[p1]);//1//1
                p2++;
            }
            else
            {
                p1++;
                p2 = p1 + 1;//this can be N in worst scenario.
            }
            
        }
        return max_Profit;
        
    }
}
