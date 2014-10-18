package ch3;


public class MinStack {

	class Node{
		int minValue;
		int current; 
		Node next;
		
		public Node(int current){
			this.current = current;
		}
		
		public Node(Node next, int current){
			this.next = next;
			this.current = current;
		}
	}
	
	Node top; 
	public void push(int value){
		if (top==null){
			top = new Node(value);
			top.minValue = value;
		}
		else{
			top = new Node(top,value);
			top.minValue = Math.min(value, top.next.minValue);
		}
	}
	
	public static int min(MinStack mStk){
		Node top = mStk.top;
		if (top == null)
			return Integer.MAX_VALUE;
		else 
			return top.minValue;
	}
	
	public int pop(){
		int res = -1;
		if (top!=null){
			res = top.current;
			top = top.next;
		}
		return res;
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer();
		Node temp = top; 
		while(temp != null){
			buf.append(temp.current);
			buf.append(" ");
			temp = temp.next;			
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		MinStack stk = new MinStack();
		stk.push(3);
		stk.push(2);
		stk.push(1);
		stk.push(6);
		stk.pop();

		System.out.println(min(stk));
	}

}
