class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<String , List<String>>();
        for(String s : strs)
        {
            //frequency array for 26 letters.
            int count[] = new int[26];
            //convert string in charArray.
            char charArray[] = s.toCharArray();
            for(char c : charArray)
            {
                // Step 2: Count each character
                count[c - 'a']++;
            }
            //build unique string key using character
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < 26 ; i++)
            {
                sb.append("#"); //delimiter for avoid collision
                sb.append(count[i]);//adding frequency of char.
            }
            //building key using string builder
            String key = sb.toString();
            if(!map.containsKey(key))
            {
                //key : ate , Value : []
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
