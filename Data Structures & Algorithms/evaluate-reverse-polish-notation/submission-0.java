class Solution {
    public boolean isop(String c)
    {
        return (c.equals("+")||c.equals("-")||c.equals("*")||c.equals("/"));
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer>st=new Stack<>();
        for(String c:tokens)
        {
            
            if(isop(c)&&!st.isEmpty())
            {
                
                int b=st.pop();
                int a=st.pop();
                if(c.equals("+"))
                {
                    int res=a+b;
                st.add(res);
                }
                if(c.equals("-"))
                {
                    int res=a-b;
                st.add(res);
                }
                if(c.equals("*"))
                {
                    int res=a*b;
                st.add(res);
                }
                if(c.equals("/"))
                {
                    int res=a/b;
                st.add(res);
                }
               
            }
            else 
            {
                st.push(Integer.parseInt(c));
            }
        }
        if(!st.isEmpty())
        return st.pop();
        else 
        return -1;
    }
}
