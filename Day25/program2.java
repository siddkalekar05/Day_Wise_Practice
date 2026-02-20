import java.util.*;
class StreamDemo2{
        public static void main(String[] args){
                List<Integer> l = new ArrayList<>();
                l.add(5);
                l.add(10);
                l.add(15);
                l.add(20);
                System.out.println(l);
                l.stream().filter(n->n%2==0).forEach(System.out::println);
        }
}
