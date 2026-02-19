/*
Day 24 — Java Streams 
Program:
Basic Stream forEach example

Concept:
stream() + forEach()

Explanation:
- stream() converts collection into stream pipeline.
- forEach() is terminal operation.
- Method reference (::) used for cleaner code.

Learning Outcome:
Understanding basic stream pipeline execution.
*/
import java.util.*;
class StreamDemo1{
	public static void main(String[] args){
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		l.stream().forEach(System.out::println);
	}
}
