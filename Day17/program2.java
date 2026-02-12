/*
Concept:
Removing elements from both ends.
*/
import java.util.*;
class DequeDemo2{
	public static void main(String[] args){
		Deque<Integer> q = new ArrayDeque<>();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);

		//Remove Operations 
		q.removeFirst();
		q.removeLast();
		System.out.println(q);
	}
}
