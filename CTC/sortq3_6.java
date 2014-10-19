package ch3;

import java.util.Iterator;
import java.util.Stack;

public class sortq3_6 {

	public static Stack<Integer> sortStack(Stack<Integer> a){
		Stack<Integer> b = new Stack<Integer>();
		while (!a.isEmpty()){
			int temp = a.pop();
			while (!b.isEmpty() && b.peek()>temp){
				a.push(b.pop());
			}
			b.push(temp);
		}
		return b;
	}
	
	public static void main(String[] args) {
		Stack<Integer> c = new Stack<Integer>();
		c.push(3);
		c.push(1);
		c.push(5);
		
		Stack<Integer> d = sortStack(c);
		Iterator<Integer> it = d.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
