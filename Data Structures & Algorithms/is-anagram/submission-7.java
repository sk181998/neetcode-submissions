class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        Approach : 1 Sorting - Nlogn
        1. sort the both string s and t .
        2. returns s.equals(t) 
        3. if it will equal then return true else false;
        edge case
        first check length of s and t is equal if not equal then anagram is
        not possible.

        Approach: 2
        1. Count frequency of every character in s
        2. Decrease frequency while traversing t
        3. If any frequency becomes negative, return false
        */
        //optimize
        if(s.length() != t.length())
        {
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0 ; i < s.length() ; i++)
        {
            freq[s.charAt(i) - 'a']++;//it will increase the each character frquency
        }
        for(int i = 0 ; i < t.length() ; i++)
        {
            freq[t.charAt(i) - 'a']--;//it will reduce the each character frequency
        }
        for(int count : freq)
        {
            if(count != 0)
            {
                return false;
            }
        }
        return true;
        
        

        
    }
}
