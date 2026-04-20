class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        Approach :
        1. First check the length of the both string. If length is not equal then return false;
        2. If both strings have different lengths → they cannot be anagrams.
        3. Create a frequency array of size 26
            This array will store count of each character (a to z).
        4. Traverse first string (s)
            For every character → increase its count in the array.
        5. Traverse second string (t)
            For every character → decrease its count in the same array.

        6. If all values in the array are 0, then:
            Every character matched perfectly → anagram
            Otherwise → not anagram
        */
        //If lengths are different → cannot be anagram
        if(s.length() != t.length())
        {
            return false;
        }
        //This array will store frequency of characters
        int[] count = new int[26];
        //Count Characters from s
        //example = racecar
        for(char ch : s.toCharArray())
        {
            count[ch - 'a']++;
        }
        //Count Characters from t
        //If t = "carrace" → all values become 0
        //If mismatch → some values ≠ 0
        for(char ch : t.toCharArray())
        {
            count[ch - 'a']--;
        }
        //Each index stores the net frequency:
        // +1 for characters from string s
        // -1 for characters from string t
        for(int c : count)
        {
            if(c!= 0)
            {
                return false;
            }
        }
        return true;
    }
}
