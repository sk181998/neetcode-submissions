class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char charArr[] = s.toCharArray();
        int top = -1;
        for(int i = 0 ; i < charArr.length ; i++)
        {
            
            if(charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '[')
            {
                st.push(charArr[i]);
                top++;
            }
            else
            {
                if(st.size()==0 || st.isEmpty())
                {
                    return false;
                }
                if(st.peek()== '(' && charArr[i] == ')' || 
                st.peek()== '{' && charArr[i] == '}' ||
                st.peek()== '[' && charArr[i] == ']')
                {
                    st.pop();
                    top--;
                }
                else
                {
                    return false;
                }
                
            }
        }
        return st.size()==0;
        
    }

}
