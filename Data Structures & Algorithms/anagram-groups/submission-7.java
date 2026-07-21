class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Main HashMap
        // Key   -> Character frequency map of a word
        // Value -> List of all strings having the same character frequency
        HashMap<HashMap<Character , Integer> , ArrayList<String>> bmap = new HashMap<>();
        // Traverse each string in the input array
        for(String s : strs)
        {
            // Frequency map for the current string
            HashMap<Character, Integer> fmap = new HashMap<>();
            // Count frequency of every character in the current string
            for(int i = 0 ; i < s.length() ; i++)
            {
                //Get current character
                char ch = s.charAt(i);
                // Increase its frequency by 1
                // If character is not present, initialize its count with 0
                fmap.put(ch, fmap.getOrDefault(ch, 0)+ 1);
            }
            // If this frequency map is not already present,
            // create a new group
            if(!bmap.containsKey(fmap))
            {
                // Create a new list
                ArrayList<String> al = new ArrayList<>();
                // Add current string into the list
                al.add(s);
                // Store the list against the frequency map
                bmap.put(fmap , al);
            }
            // If another string with the same frequency map already exists
            else
            {
                // Get the existing list
                ArrayList<String> al = bmap.get(fmap);
                // Add the current string into that group
                al.add(s);
            }
        }
        // Create the final answer list
        List<List<String>> result = new ArrayList<>();
        // Copy all grouped lists from the HashMap into the result
        for(ArrayList<String> val :bmap.values())
        {
            result.add(val);
        }
        // Return all anagram groups
        return result;
    }
}
