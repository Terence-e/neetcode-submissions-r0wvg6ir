class MinStack {
    Stack<Integer> stack;
    Stack<Integer> n = new Stack<>();

    public MinStack() {
       stack = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (n.isEmpty()){
            n.push(val);
        } else if(val <= n.peek()){
            n.push(val);
        }
        
    }
    
    public void pop() {
        int r = stack.pop();
        if (r == n.peek()){
            n.pop();
        }
        
    }
    
    public int top() {
       
        
     return stack.peek();
        
    }
    
    public int getMin() {
        return n.peek();

    }
}
