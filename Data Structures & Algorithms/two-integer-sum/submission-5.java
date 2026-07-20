class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        problem was in brute force it was taking O(N2) time
        because of two loop iterating all the elements.
        optimize the approach.
        can we think about hashmap
        what i will do
        1. I will create the hashmap
        2. Iterate one loop and check if target - currentelement is present in the hashmap 
        or not if not then put the current element in map with index.
        3. if present then add the current element index in result 
        and index of target - current element.
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        int result[] = new int[2];
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(!map.containsKey(target - nums[i]))
            {
                map.put(nums[i], i);
            }
            else
            {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            }
        }
        return result;
        
    }
}
