/*
Day 14 — Collections (List)

Program:
Remove duplicates using HashSet

Concept:
Set does not allow duplicate values

Explanation:
- Convert List → Set
- Duplicates automatically removed.

Time Complexity:
O(n)
*/

import java.util.*;
class CollectionDemo5 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(59);
        al.add(56);
        al.add(44);
        al.add(11);
        al.add(59);
        al.add(56);
        al.add(44);
        System.out.println(al);
        TreeSet<Integer> ts = new TreeSet<>(al);
        System.out.println(ts);

    }
    
}
