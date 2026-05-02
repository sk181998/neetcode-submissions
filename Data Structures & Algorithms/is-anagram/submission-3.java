class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] count = new int[26];//N
        for(char ch : s.toCharArray())
        {
            count[ch - 'a']++;
        }
        for(char ch : t.toCharArray())
        {
            count[ch - 'a']--;//if count become 0 it means same element is present
        }
        for(int c : count)
        {
            if(c != 0)
            {
                return false;
            }
        }
        return true;
    }
}
