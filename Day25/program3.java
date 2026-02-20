import java.util.*;
class StreamDemo3{
        public static void main(String[] args){
                List<Integer> l = new ArrayList<>();
                l.add(10);
                l.add(20);
                l.add(30);
                l.add(40);
                System.out.println(l);
                l.stream().map(n->n*n).forEach(System.out::println);
        }
}
