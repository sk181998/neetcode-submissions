class Solution {
    public int[] twoSum(int[] nums, int target) {
        int output[] = new int[2];
        int index = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer> ();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(target - nums[i]))
            {
                output[0] = map.get(target - nums[i]);
                output[1] = i;
            }
            map.put(nums[i], i);
        }
        return output;
        
    }
}
