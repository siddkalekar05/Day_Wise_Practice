/*
Concept:
TreeSet stores elements in sorted order.
*/

import java.util.*;
class CollectionDemo3{
    public static void main(String[] args) {
      TreeSet<String> ls = new TreeSet<>();
       ls.add("Pune");
       ls.add("Nashik");
       ls.add("Mumbai");
       ls.add("Nagpur");
       System.out.println(ls);

       TreeSet<Integer> ts = new TreeSet<>();
       ts.add(56);
       ts.add(45);
       ts.add(18);
       ts.add(7);
       ts.add(1);
       System.out.println(ts);
    }
}
