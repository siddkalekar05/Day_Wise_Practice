/*
Day 26 — Streams Advanced

Program:
Generating statistics using summarizingInt()

Concept:
Collectors.summarizingInt()

Explanation:
- Calculates count, sum, min, max, average in one pass.
- n -> n means use the integer itself.
- Returns IntSummaryStatistics object.
- Provides methods:
  getSum(), getAverage(), getMin(), getMax(), getCount().

Use Case:
Generating reports,
Analytics dashboards.

Learning Outcome:
Understanding statistical aggregation in Streams.
*/
import java.util.*;
import java.util.stream.Collectors;

class StreamDemo5 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40);

        IntSummaryStatistics stats =
                list.stream()
                    .collect(Collectors.summarizingInt(n -> n));

        System.out.println("Sum: " + stats.getSum());
        System.out.println("Avg: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
    }
}
