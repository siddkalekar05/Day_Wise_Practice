/*
Day 17 — Deque

Concept:
Deque allows insertion from both ends.
*/

import java.util.*;
class DequeDemo1{
	public static void main(String[] args){
		Deque<Integer> qd = new ArrayDeque<>();
		
		qd.addFirst(10);
		qd.addLast(20);
		qd.addFirst(30);
		qd.addLast(40);

		System.out.println(qd);
	}
}
