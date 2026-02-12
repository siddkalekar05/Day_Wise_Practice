/*
Concept:
Undo system using Deque.
*/

import java.util.*;
class DequeDemo6{
	public static void main(String[] args){
		Deque<String> q = new ArrayDeque<>();
		q.add("List 1");
		q.add("List2");
		q.add("List3");
		q.add("List4");
		q.add("List5");
		System.out.println(q);

		System.out.println("UNDO1 : "+q.pop());
		System.out.println("UNDO2 : "+q.pop());
		System.out.println(q);
	}
}
