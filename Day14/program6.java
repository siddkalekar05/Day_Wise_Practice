/*
Day 14 — Collections (List)

Program:
LinkedList example

Concept:
LinkedList

Explanation:
- Uses node-based structure.
- Faster insertion/deletion than ArrayList.
- Slower random access.

Time Complexity:
Insertion → O(1)
Access → O(n)
*/

import java.util.*;
import java.util.LinkedList;
class CollectionDemo6 {
    public static void main(String[] args) {
        List<String> al = new LinkedList<>();
        al.add("Sidd");
        al.add("Kalekar");
        al.add("Oneplus11r");
        al.add("Asus Tuf15");

        System.out.println(al);
    } 
}
