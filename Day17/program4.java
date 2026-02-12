/*
Concept:
ArrayDeque used as Queue (FIFO).
*/

import java.util.*;
class DequeDemo4{
	public static void main(String[] args){
		Deque<Integer> q = new ArrayDeque<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println(q);
	}
}
