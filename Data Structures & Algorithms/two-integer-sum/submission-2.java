class Solution {
    public int[] twoSum(int[] nums, int target) {
        int output[] = new int[2];//constant time
        int index = 0;
        //brute force
        for(int i = 0 ; i < nums.length ; i++)
        {
            for(int j = i + 1 ; j < nums.length ; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    output[index++] = i;
                    output[index] = j;
                }
            }
        }
        return output;
        
    }
}
