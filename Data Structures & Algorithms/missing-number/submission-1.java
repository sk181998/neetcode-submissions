class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int sumOfNaturalNumber = nums.length * (nums.length + 1)/2;//N
        for(int i = 0 ; i < nums.length ; i++)//N
        {
            sum = sum + nums[i];
        }
        return sumOfNaturalNumber - sum;
        
    }
}
