class Solution {
    public boolean isAnagram(String s, String t) {
        /*
         Sort the string and compare each character of the both string.
         if equal then return true;
         sorting will take nlogn time.
        */
        if(s.length()!= t.length())
        {
            return false;
        }
        char[] charr1 = s.toCharArray();//convert string in chararray
        char[] charr2 = t.toCharArray();
        Arrays.sort(charr1);//sort the chararray
        Arrays.sort(charr2);
        return Arrays.equals(charr1 , charr2);//compare the both char array and return
    }
}
