class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int index = 0;
        for(int i = 0 ; i < nums.length ; i++)//n
        {
            for(int j = i + 1 ; j < nums.length ; j++)//n
            {
                if(nums[i] + nums[j] == target)
                {
                    ans[index++] = i;
                    ans[index] = j;  
                }
            }
        }
        return ans;
//TC - O(N2)
        
    }
}
