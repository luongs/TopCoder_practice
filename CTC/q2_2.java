package ch2;

import java.util.Iterator;
import java.util.LinkedList;

public class q2_2 {

	public static int kToLast(LinkedList<Integer> ll, int k){
		if (ll == null)
			return -1;
		int index = 0;
		int goal = ll.size() - k;
		if (goal<0)
			return -1;
		while (index < goal)
			index++;
		return ll.get(index);
	}

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		
		System.out.println(kToLast(ll, 1));
	}

}
