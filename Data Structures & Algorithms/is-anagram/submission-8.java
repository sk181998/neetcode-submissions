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
        if(s.length() != t.length())
        {
            return false;
        }
        char str1[] = s.toCharArray();
        char str2[] = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);

    }
}
