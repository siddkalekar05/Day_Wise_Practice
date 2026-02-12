/*
Concept:
Iterating through deque.
*/

import java.util.*;
class DequeDemo5{
	public static void main(String[] args){
		Deque<Integer> q = new ArrayDeque<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);

		for(int data : q){
			System.out.println(data);
		}
	}
}
