package ch3;

public class CustomStack {
	
	class Node {
		Node next; 
		int data;
		
		public Node(int data){
			this.data = data;
		}
		
		public Node(Node next, int data){
			this.next = next;
			this.data = data;
		}
		
		public Node getNode(){
			return next;
		}
		
		public int getData(){
			return data;
		}
	}
	
	Node nd;
	
	public CustomStack(){
		nd = null;
	}
	
	public void push(int data){
		nd = new Node(nd, data);
	}
	
	public int pop(){
		int res = -1;
		if (nd!=null){
			res = nd.data;
			nd = nd.next;
		}
		return res;
	}
	
	public int peek(){
		int res = -1;
		if (nd!=null){
			res = nd.data;
		}
		return res;
	}
	
	public boolean isEmpty(){
		return nd==null;
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer();
		Node temp = nd; 
		while(temp != null){
			buf.append(temp.data);
			buf.append(" ");
			temp = temp.next;			
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		CustomStack stk = new CustomStack();
		stk.push(3);
		stk.push(2);
		stk.push(1);
	}

}
