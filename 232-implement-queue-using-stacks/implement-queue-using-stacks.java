class MyQueue {
    Stack<Integer> stk;
    Stack<Integer> stk1;
    public MyQueue() {
        stk = new Stack<>();
        stk1 = new Stack<>();
    }
    
    public void push(int x) {
        stk.push(x);
    }
    
    public int pop() {
        while(!stk.isEmpty()){
            stk1.push(stk.pop());
        }
        int ans = stk1.pop();
        while(!stk1.isEmpty()){
            stk.push(stk1.pop());
        }
        return ans;
    }
    
    public int peek() {
        while(!stk.isEmpty()){
            stk1.push(stk.pop());
        }
        int ans = stk1.peek();
        while(!stk1.isEmpty()){
            stk.push(stk1.pop());
        }
        return ans;
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */