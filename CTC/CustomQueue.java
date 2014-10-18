package ch3;

public class CustomQueue {
	
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
	
	Node first;
	Node last;
	
	public CustomQueue(){
		first= null;
		last = null;
	}
	
	public void enqueue(int data){
		if (first==null){
			last = new Node(data);
			first = last;
		}
		else{
			last.next = new Node(data);
			last = last.next;
		}
	}
	
	public int dequeue(){ 
		if (first!=null){
			int res = first.data;
			first = first.next;
			if (first==null)
				last = null;
			return res;
		}
		return -1;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer();
		Node temp = first; 
		while (temp!=null){
			buf.append(temp.data);
			buf.append(" ");
			temp = temp.next;
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		CustomQueue q = new CustomQueue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.print(q);
	}

}
