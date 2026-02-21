/*
Day 26 — Streams Advanced

Program:
Finding maximum using reduce()

Concept:
reduce() with method reference

Explanation:
- Integer.MIN_VALUE is identity value.
- Integer::max compares two numbers and returns larger.
- Stream iterates and keeps updating maximum.

Use Case:
Finding highest/lowest values in datasets.

Learning Outcome:
Using reduce() for comparison operations.
*/
import java.util.*;
class StreamDemo2{
	public static void main(String[] args){
		List<Integer> l = Arrays.asList(1,23,45,6,8);
		int max = l.stream().reduce( Integer.MIN_VALUE , Integer::max);
		System.out.println(max);
	}
}
