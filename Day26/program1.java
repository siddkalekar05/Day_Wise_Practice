/*
Day 26 — Streams Advanced

Program:
Using reduce() to calculate sum

Concept:
reduce() terminal operation

Explanation:
- reduce() combines all elements into a single result.
- First argument (0) is identity value (starting point).
- Second argument is accumulator function.
- (a, b) -> a + b keeps adding elements step-by-step.

Use Case:
Aggregation operations like sum, max, product.

Learning Outcome:
Understanding how stream reduces multiple elements into one value.
*/
import java.util.*;
class StreamDemo1{
	public static void main(String[] args){
		List<Integer> l = Arrays.asList(10,20,30,40,50);
		int sum = l.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
}
