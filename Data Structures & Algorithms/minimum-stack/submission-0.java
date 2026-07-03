class MinStack {
    Stack<Integer>st;
    public MinStack() {
    st=new Stack<>();
        
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
      if(!st.isEmpty())
      st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer>min=new Stack<>();
        int mini=st.peek();
        while(!st.isEmpty())
        {
            mini=Math.min(mini,st.peek());
            min.add(st.pop());
        }
        while(!min.isEmpty())
        {
            st.push(min.pop());
        }
        return mini;
    }
}
