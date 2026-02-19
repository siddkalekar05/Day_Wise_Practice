import java.util.*;
import java.util.stream.Collectors;
class StreamDemo5{
        public static void main(String[] args){
                List<Integer> l = new ArrayList<>();
                l.add(5);
                l.add(8);
                l.add(3);
                l.add(4);
                System.out.println(l);
                List<Integer> result =l.stream().filter(n -> n >= 4).collect(Collectors.toList());
                System.out.println(result);
        }
}
