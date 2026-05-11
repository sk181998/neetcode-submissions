class Solution {
    public int maxSubArray(int[] nums) {
        /*
        2,-3,4,-2,2,1,-1,4

        sum = 2 -> 0 -> 4 -> 2 -> 4->5 -> 4 ->8
        maxsum = 2 -> 4-> 4 ->4 ->5 ->5-> 8

        */
        int sum = 0 ;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(sum < 0)
            {
                sum = 0;
            }
            sum = sum + nums[i];
            maxSum = Math.max(sum , maxSum);
        }
        return maxSum;
        
    }
}
