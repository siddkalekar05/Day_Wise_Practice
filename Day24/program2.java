/*
Day 24 — Java Streams 
Program:
Filtering even numbers using filter()

Concept:
filter() intermediate operation

Explanation:
- filter() accepts Predicate.
- It selects elements matching condition.
- Execution happens only after terminal operation.

Learning Outcome:
Understanding stream filtering logic.
*/
import java.util.*;
class StreamDemo2{
        public static void main(String[] args){
                List<Integer> l = new ArrayList<>();
                l.add(5);
                l.add(10);
                l.add(15);
                l.add(20);
                System.out.println(l);
                l.stream().filter(n->n%2==0).forEach(System.out::println);
        }
}
