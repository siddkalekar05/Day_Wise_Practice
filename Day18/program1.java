/*
Day 18 — Iterator

Concept:
Iterator is used to traverse a collection.
*/

import java.util.*;
class IteratorDemo1{
	public static void main(String[] args){
		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		System.out.println(ll);

		Iterator itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
