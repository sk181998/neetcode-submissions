class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //act is the first key rest similar character will be value
        HashMap<String , List<String>> map = new HashMap<String , List<String>>();
        for(String s : strs)
        {
            //convert string in char array.
            char charArray[] = s.toCharArray();
            //now sort the charArray and convert again charArray in string
            Arrays.sort(charArray);//nlogn 
            String sortedstring = new String(charArray);
            // i will check that sortedstring is present in map or not
            //if not i will add.
            if(!map.containsKey(sortedstring))
            {
                map.put(sortedstring, new ArrayList<String>());
            }
            map.get(sortedstring).add(s);
        }
        return new ArrayList<>(map.values());
        /*
        observations 
        doing sorting for each type anagram 
        consider eat as a key and doing sorting of ate ,tea and all
        it takes nlogn time and repetitive work for each type of anagram.
        */

        
    }
}