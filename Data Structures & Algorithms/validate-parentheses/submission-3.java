class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char charArr[] = s.toCharArray();
        for(int i = 0 ; i < charArr.length ; i++)
        {
            //opening case
            if(charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '[')
            {
                st.push(charArr[i]);
            }
            else//closing case
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
                }
                else
                {
                    return false;
                }
                
            }
        }
        return st.isEmpty();//if anything left in stack in that case false for true stack should be empty.
        
    }

}
