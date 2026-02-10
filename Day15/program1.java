/*
Day 15 — Collections (Set)

Program:
HashSet example

Concept:
Set does not allow duplicates.
*/

import java.util.*;
class CollectionDemo1{
    public static void main(String[] args) {
       HashSet<Integer> st = new HashSet<>();
       st.add(30);
       st.add(10);
       st.add(10);
       st.add(20);

       System.out.println(st);
    }
}
