class Solution {
    public int maxProfit(int[] prices) {
        /*

        */
        int minimum = prices[0];//10
        int maxprofit = 0;
        for(int i = 1; i < prices.length ;i++)
        {
            int cost = prices[i] - minimum;//-9 -> 4-> 5
            maxprofit = Math.max(cost , maxprofit);//0 ->4 ->6
            minimum = Math.min(minimum,prices[i]);//1 -> 1 -> 1
        }
        return maxprofit;
        
    }
}
