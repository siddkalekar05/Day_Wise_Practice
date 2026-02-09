/*
Day 14 — Collections (List)

Program:
ArrayList add and display example

Concept:
ArrayList

Explanation:
- ArrayList is a dynamic array.
- Elements can be added using add().
- Size grows automatically.

Time Complexity:
Add → O(1)
Access → O(1)
*/

import java.util.*;
class CollectionDemo1 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);
    }
    
}
