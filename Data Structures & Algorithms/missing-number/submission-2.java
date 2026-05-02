class Solution {
    public int missingNumber(int[] nums) {
        /*
        n = 1234 = 10
        nums[i] = 124 = 7

        difference = 10 - 7 = 3 -- missing no
        */
        int N = nums.length;
        int sumOfNaturalnumbers = N *(N + 1)/2;
        int sumofArrayElements = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            sumofArrayElements = sumofArrayElements + nums[i];
        }
        return sumOfNaturalnumbers - sumofArrayElements;
    }
}
