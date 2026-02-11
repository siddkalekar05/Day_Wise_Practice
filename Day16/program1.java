/*
Day 16 — Queue

Concept:
Queue follows FIFO (First In First Out).
*/

import java.util.*;
class QueueDemo{
	public static void main(String[] args){
		Queue<String> q = new LinkedList<>();
		q.add("Siddhesh");
		q.add("Santosh");
		q.add("Kalekar");

		System.out.println(q);
	}
}
