/*
Concept:
Iterating HashMap using entrySet().
*/

import java.util.*;
class CollectionDemo5{
    public static void main(String[] args) {
      HashMap<Integer , String> hm = new HashMap<>();
      hm.put(1, " Siddhesh");
      hm.put(2, " Santosh");
      hm.put(3, " Manisha");
      hm.put(4, " Piyush"); 

      System.out.println(hm);

     for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
         }
    }
}
