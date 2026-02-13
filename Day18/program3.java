/*
Concept:
Comparable interface for natural sorting.
*/

import java.util.*;
class IteratorDemo3 implements Comparable<IteratorDemo3>{
	int marks;
	IteratorDemo3(int marks){
		this.marks = marks;
	}
	public int compareTo(IteratorDemo3 i){
		return this.marks - i.marks;
	}
	public String toString(){
		return ""+marks;
	}
}
class Example{
	public static void main(String[] args){
		List<IteratorDemo3> ll = new ArrayList<>();
		ll.add(new IteratorDemo3(70));
		ll.add(new IteratorDemo3(50));
		ll.add(new IteratorDemo3(90));
		System.out.println(ll);

		Collections.sort(ll);

		System.out.println(ll);
	}
}
