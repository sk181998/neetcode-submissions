class Solution {
    public boolean isPalindrome(String s) {
        char arr[] = s.toLowerCase().toCharArray();
        int p1 = 0;
        int p2 = arr.length - 1;
        boolean flag = true;
        if(s.length() < 0)
        {
            return false;
        }
        while(p1 < p2)
        {
            if(!Character.isLetterOrDigit(arr[p1]))
            {
                p1++;
            }
            else if(!Character.isLetterOrDigit(arr[p2]))
            {
                p2--;
            }
            else if(arr[p1] == arr[p2])
            {
                flag = true;
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
