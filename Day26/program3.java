import java.util.*;
import java.util.stream.Collectors;
class StreamDemo3{
        public static void main(String[] args){
                List<String> l = Arrays.asList("Siddhesh" , "Chetan","Abhishek");
                Map<Integer ,List<String>> h = l.stream().collect(Collectors.groupingBy(name -> name.length()));
                System.out.println(h);
        }
}
