/*
Day 26 — Streams Advanced

Program:
Joining strings using joining()

Concept:
Collectors.joining()

Explanation:
- joining() combines stream elements into single string.
- ", " is delimiter between elements.
- Useful for formatting output.

Use Case:
CSV creation,
Building response strings,
API data formatting.

Learning Outcome:
Understanding string aggregation in Streams.
*/
import java.util.*;
import java.util.stream.Collectors;

class StreamDemo6 {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java", "Spring", "Docker");

        String result =
                list.stream()
                    .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
