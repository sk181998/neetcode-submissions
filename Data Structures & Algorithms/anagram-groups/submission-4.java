class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String s : strs)
        {
            //convert string in chararray.
            char charArray[] = s.toCharArray();
            //sort the char array
            Arrays.sort(charArray);
            //now convert sorted charr array in string
            String key = new String(charArray);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        



        


        
    }
}
