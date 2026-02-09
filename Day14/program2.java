/*
Day 14 — Collections (List)

Program:
Iterating ArrayList using for-each loop

Concept:
List traversal

Explanation:
- for-each loop simplifies iteration.
- Works well when index is not required.

Time Complexity:
O(n)
*/

import java.util.*;
class CollectionDemo2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
