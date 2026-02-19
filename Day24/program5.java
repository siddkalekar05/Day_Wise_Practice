/*
Day 24 — Java Streams 
Program:
Sorting elements using sorted()

Concept:
sorted() intermediate operation

Explanation:
- sorted() arranges elements in natural order.
- Requires Comparable implementation.
- Executes only when terminal operation is called.

Learning Outcome:
Understanding stream-based sorting.
*/

import java.util.*;
import java.util.stream.Collectors;
class StreamDemo5{
        public static void main(String[] args){
                List<Integer> l = new ArrayList<>();
                l.add(5);
                l.add(8);
                l.add(3);
                l.add(4);
                System.out.println(l);
                List<Integer> result =l.stream().filter(n -> n >= 4).collect(Collectors.toList());
                System.out.println(result);
        }
}
