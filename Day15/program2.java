/*
Concept:
LinkedHashSet maintains insertion order.
*/

import java.util.*;
class CollectionDemo2{
    public static void main(String[] args) {
       LinkedHashSet<String> ls = new LinkedHashSet<>();
       ls.add("Pune");
       ls.add("Nashik");
       ls.add("Mumbai");
       ls.add("Nagpur");
       System.out.println(ls);
    }
}
