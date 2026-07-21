class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++)//n
        {
            sum += nums[i];
            maxSum = Math.max(sum , maxSum);
            //kadene's algo
            if(sum < 0)
            {
                sum = 0;
            }
        }
        return maxSum;
        
    }
}
