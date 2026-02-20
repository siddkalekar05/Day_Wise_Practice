/*
Concept:
peek() used for debugging
*/
import java.util.*;
class StreamDemo4{
        public static void main(String[] args){
                List<Integer> l = new ArrayList<>();
                l.add(5);
                l.add(8);
                l.add(3);
                l.add(4);
                System.out.println(l);
                long count = l.stream().filter(n->n>5).count();
		System.out.println(count);
        }
}
