package ch3;

import java.util.Stack;

public class MyQueue {

	Stack<Integer> a = new Stack<Integer>();
	Stack<Integer> b = new Stack<Integer>();
	
	public void enqueue(int num){
		while (!a.isEmpty()){
			b.push(a.pop());
		}
		a.push(num);
		while (!b.isEmpty()){
			a.push(b.pop());
		}
	}
	
	public int dequeue(){
		if (a.isEmpty())
			return -1;
		else 
			return a.pop();
	}
	
	public String toString(){
		StringBuffer buf = new StringBuffer();
		while (!a.isEmpty()){
			buf.append(a.pop());
			buf.append(" ");
		}
		return buf.toString();
	}
	
	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		
		System.out.println(q);
	}

}
