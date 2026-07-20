class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        1. edge case nums array length should be or greated than 2.
        brute force solution
        1. iterate one outer loop from first element to last element.
        2. iterate one inner lopp from i + 1 to till 2nd last element to 
        avoid out of index issue.
        3. check arr[start] + arr[end] = sum
        4. if yes then use result array to store the start and end index 
        then return the result array.

        */
        //Brute Force
        if(nums.length < 2)
        {
            return new int[2];
        }
        int result[] = new int[2];
        int sum = 0;
        int idx = 0;
        for(int start = 0 ; start < nums.length - 1 ; start++)
        {
            //this will get reset after completing each iteration of end.
            sum = 0;
            for(int end = start + 1 ; end <= nums.length - 1 ; end++)
            {
                sum = nums[start] + nums[end];
                if(sum == target)
                {
                    result[idx++] = start;
                    result[idx] = end;
                    return result;
                }
            }
        }
        return new int[2];
        
    }
}
