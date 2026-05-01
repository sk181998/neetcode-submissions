class Solution {
    public boolean hasDuplicate(int[] nums) {
        /*
        if array element frequency > 1 then return true;
        else false.
        */
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(map.containsKey(nums[i]))//it means array element already present means frequency > 1
            {
               return true;
            }
            map.put(nums[i],1);
        }
        return false;

        
    }
}