/*
Concept:
ArrayDeque used as Stack (LIFO).
*/

import java.util.*;
class DequeDemo3{
	public static void main(String[] args){
		Deque<Integer> q = new ArrayDeque<>();
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		System.out.println(q);

		System.out.println(q.pop());
		System.out.println(q.peek());
		System.out.println(q);
	}
}
