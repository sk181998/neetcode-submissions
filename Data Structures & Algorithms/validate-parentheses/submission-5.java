class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char arr[] = s.toCharArray();
        for(int i = 0 ; i < arr.length ; i++)
        {
            //opening case
            if(arr[i]== '(' || arr[i] == '{' || arr[i] == '[')
            {
                st.push(arr[i]);
            }
            else
            {
                if(st.size() == 0 || st.isEmpty())
                {
                    return false;
                }
                if(st.peek() == '(' && arr[i] == ')'
                || st.peek() == '{' && arr[i] == '}'
                || st.peek() == '[' && arr[i] == ']')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }

        }
        return st.isEmpty();
        
    }
}
