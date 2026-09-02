class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        edge case
        1. length should be same for string s and t.
        2. frequency of each character should be same in s and t.
        
        Approach 1:
        1. sort the both string and compare . time complexity Nlogn.

        Approach 2: 
        1. create frequency array and count the frequency of each char of s 
        with the help of ascii value. and increase the count[]++;
        2. use same frequency array for t as well and and decrease the count[]--;
        if count value is 0 it means its valid anagram.
        */
        //edge case
        if(s.length() != t.length())
        {
            return false;
        }
        int freq[] = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            freq[s.charAt(i) - 'a']++;//increase the frequency of the each character
        }
        for(int i = 0; i < t.length(); i++)
        {
            freq[t.charAt(i) - 'a']--;//decerease the frequency of the each character.
        }
        //if count of each char is zero then vlaid anagram.
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
