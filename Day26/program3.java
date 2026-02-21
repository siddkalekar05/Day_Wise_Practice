/*
Day 26 — Streams Advanced

Program:
Grouping strings by their length

Concept:
Collectors.groupingBy()

Explanation:
- groupingBy() groups elements based on classifier function.
- name -> name.length() determines grouping key.
- Returns Map<Key, List<Value>>.
- Keys are lengths.
- Values are list of strings with that length.

Use Case:
Grouping employees by department,
Grouping products by category.

Learning Outcome:
Understanding grouping logic using Streams.
*/
import java.util.*;
import java.util.stream.Collectors;
class StreamDemo3{
        public static void main(String[] args){
                List<String> l = Arrays.asList("Siddhesh" , "Chetan","Abhishek");
                Map<Integer ,List<String>> h = l.stream().collect(Collectors.groupingBy(name -> name.length()));
                System.out.println(h);
        }
}
