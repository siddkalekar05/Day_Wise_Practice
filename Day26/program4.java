/*
Day 26 — Streams Advanced

Program:
Partitioning numbers into even and odd

Concept:
Collectors.partitioningBy()

Explanation:
- partitioningBy() divides elements into two groups.
- Predicate decides TRUE or FALSE group.
- Returns Map<Boolean, List<T>>.
- TRUE group = condition satisfied.
- FALSE group = condition not satisfied.

Use Case:
Splitting active/inactive users,
Even/odd numbers,
Pass/fail students.

Learning Outcome:
Understanding boolean-based grouping.
*/
import java.util.*;
import java.util.stream.Collectors;

class StreamDemo4 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> result =
                list.stream()
                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);
    }
}
