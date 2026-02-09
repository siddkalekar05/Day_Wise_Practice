/*
Day 14 — Collections (List)

Program:
Sorting ArrayList

Concept:
Collections.sort()

Explanation:
- Uses TimSort internally.
- Sorts list in ascending order.

Time Complexity:
O(n log n)
*/

import java.util.*;
class CollectionDemo4 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(59);
        al.add(56);
        al.add(44);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);


    }
    
}
