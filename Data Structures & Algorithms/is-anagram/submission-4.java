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
        //brute force
        if(s.length() != t.length())
        {
            return false;
        }
        char ch1[] = s.toCharArray();
        char ch2[] = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }
}
