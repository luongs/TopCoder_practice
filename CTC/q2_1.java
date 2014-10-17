package ch2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class q2_1 {
	
	public static LinkedList<Integer> removeDupl(LinkedList<Integer> ll){
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		int index = 0;
		int size = ll.size();
		while (index<size){
			if (!hm.containsKey(ll.get(index))){
				hm.put(ll.get(index), true);
				index++;
			}
			else{
				ll.remove(index); 
				size--;
			}
		}
		return ll;
	}
	
	public static LinkedList<Integer> removeDuplInPlace(LinkedList<Integer> ll){
		int index = 0;
		int size = ll.size()-1;
		int runner = index+1;
		
		while (index < size){
			if (ll.get(index) == ll.get(runner)){
				ll.remove(runner);
				size--;
			}
			if (runner==size){
				index++;
				runner = index+1;
			}
			else 
				runner++;
		}
		return ll; 
	}

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(1);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		
		LinkedList<Integer> noDup = removeDuplInPlace(ll);
		Iterator<Integer> it = noDup.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		

	}

}
