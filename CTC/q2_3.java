package ch2;

import java.util.Iterator;
import java.util.LinkedList;

import ch2.CustomLinkedList.Node;

public class q2_3 {

	public static void deleteMiddle(Node node){
		if (node==null || node.next == null)
			return;
		while (node.next != null){
			node.value = node.next.value;
			node.next = node.next.next;
		}
		
	}
	
	public static void main(String[] args) {
		CustomLinkedList ll = new CustomLinkedList();
		ll.addToHead(1); 
		ll.addToHead(2);
		ll.addToHead(3);
		
		deleteMiddle(ll.head.next);
		System.out.println(ll);
	}

}
