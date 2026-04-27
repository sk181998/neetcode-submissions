class Solution {
    public int missingNumber(int[] nums) {
        for(int i = 1 ; i <= nums.length ; i++)//N
        {
            int flag = 0;
            for(int j = 0 ; j < nums.length ; j++)//N
            {
                if(nums[j] == i )
                {
                    flag = 1;
                    break;  
                }
            }
            if(flag == 0)
            {
                return i;
            }
        } 
         return 0;  
    } 

}
