/*
 * https://leetcode.com/problems/implement-stack-using-queues/
*/



class MyStack 
{
    Queue<Integer> q;
    
    public MyStack() 
    {
        q = new LinkedList<>();
    }
    public void push(int x) 
    {
       this.q.add(x);
    }
   public int pop() 
    {
    	int c = 0;
        for(int a : this.q)
        {
        	c = a;
        }
        this.q.remove(c);
        return c; 
    }
    public int top() {
    	int c = 0;
        for(int a : this.q)
        {
        	c = a;
        }
        
        return c;       	
    }
    public boolean empty() {
    	return this.q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
