import java.util.*;
import java.util.stream.Collectors;

class StreamDemo4 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> result =
                list.stream()
                    .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(result);
    }
}
