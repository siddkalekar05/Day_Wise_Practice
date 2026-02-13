/*
Concept:
Custom sorting using comparator.
*/

import java.util.*;
class IteratorDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Programming");
        list.add("AI");
        System.out.println(list);
        Collections.sort(list, (a, b) -> a.length() - b.length());

        System.out.println(list);
    }
}	
