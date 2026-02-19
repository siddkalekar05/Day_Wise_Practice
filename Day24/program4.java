/*
Day 24 — Java Streams 
Program:
Filtering and collecting into List

Concept:
collect() terminal operation

Explanation:
- collect() gathers stream result into collection.
- Collectors.toList() converts stream to List.
- Commonly used in backend data processing.

Learning Outcome:
Understanding result collection from stream.
*/
import java.util.*;
class StreamDemo4{
        public static void main(String[] args){
                List<Integer> l = new ArrayList<>();
                l.add(5);
                l.add(8);
                l.add(3);
                l.add(4);
                System.out.println(l);
                long count = l.stream().filter(n->n>5).count();
		System.out.println(count);
        }
}
