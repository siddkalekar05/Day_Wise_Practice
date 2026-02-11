/*
Concept:
PriorityQueue removes smallest element first.
*/

import java.util.*;
class PriorityDemo{
	public static void main(String[] args){
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(98);
		q.add(14);
		q.add(78);
		q.add(3);
		q.add(45);
		System.out.println(q);

		while(!q.isEmpty()){
			q.poll();
			System.out.println(q);
		}
	}
}
