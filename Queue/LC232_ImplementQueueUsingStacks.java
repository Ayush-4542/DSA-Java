class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1= new Stack<>();
        s2= new Stack<>();   
    }
    
    public void push(int x) {
        if(empty()){
            s1.push(x);
            return;
        }
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.empty()){
            s1.push(s2.pop());
        }

        
    }
    
    public int pop() {
        if(s1.empty()){
            return -1;
        }
        int first= s1.peek() ;
        s1.pop();
        return first;
        
    }
    
    public int peek() {
        return s1.peek();
        
    }
    
    public boolean empty() {
        return s1.size()==0;
        
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
