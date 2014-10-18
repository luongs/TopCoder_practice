package ch2;

import ch2.CustomLinkedList.Node;

public class q2_5 {

	public static CustomLinkedList addList(Node ll1Node, Node ll2Node){
		if (ll1Node == null || ll2Node== null)
			return null; 
		CustomLinkedList res = new CustomLinkedList();
		boolean carry = false; 
		int sum = 0;
		while (ll1Node != null || ll2Node != null){
			if (ll1Node == null){
				res.addToTail(ll2Node.value); 
				ll2Node = ll2Node.next;
			}
			else if (ll2Node == null){
				res.addToTail(ll1Node.value);
				ll1Node = ll1Node.next;
			}
			else{
				if (carry)
					sum++;
				sum = ll1Node.value + ll2Node.value;
				if (sum>=10){
					carry = true; 
					sum %= 10;
				}
				res.addToTail(sum);
				ll1Node = ll1Node.next;
				ll2Node = ll2Node.next;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		CustomLinkedList ll1 = new CustomLinkedList();
		CustomLinkedList ll2 = new CustomLinkedList();
		ll1.addToTail(5);
		ll1.addToTail(3);
		ll2.addToTail(5);
		ll2.addToTail(2);
		CustomLinkedList ll3= addList(ll1.head,ll2.head);
		System.out.println(ll3);
		
	}

}
