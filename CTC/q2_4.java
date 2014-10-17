package ch2;

import java.util.Iterator;
import java.util.LinkedList;

public class q2_4 {

	public static LinkedList<Integer> partition(LinkedList<Integer> ll, int value){
		int index = 0;
		if (ll==null)
			return null; 
		while (index<ll.size()){
			if(ll.get(index)<value){
				ll.addFirst(ll.get(index));
				ll.remove(index+1);
			}
			index++;
		}
		return ll;
	}
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();

		
		ll.add(5);
		//ll.add(1);
		//ll.add(4);
		//ll.add(3);
		//ll.add(1);
		//ll.add(-3);
		
		LinkedList<Integer> noDup = partition(ll,3);
		Iterator<Integer> it = noDup.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}
