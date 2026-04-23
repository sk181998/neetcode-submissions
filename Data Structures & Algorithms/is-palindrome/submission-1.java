class Solution {
    public boolean isPalindrome(String s) {
        /*
        1. convert string in char array 
        2. iterate the char array using two pointer
        3. compare first char with last one,
        second char with second last .
        4. we can do above step using two pointer
        keep p1 pointer on first letter and another pointer p2 on
        last letter of string.
        p1++ and p2--
        */
        char charArray[] = s.toLowerCase().toCharArray();
        int p1 = 0;
        int p2 = charArray.length - 1;
        boolean flag = true;
        while(p1 < p2)
        {
            if(!Character.isLetterOrDigit(charArray[p1]))
            {
                p1++;
            }
            else if(!Character.isLetterOrDigit(charArray[p2]))
            {
                p2--;
            }
            else if(charArray[p1] == charArray[p2])
            {
                p1++;
                p2--;
            }
            else
            {
                return false;
            }
        }
        return flag;

    }
}

