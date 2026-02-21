import java.util.*;
import java.util.stream.Collectors;

class StreamDemo6 {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java", "Spring", "Docker");

        String result =
                list.stream()
                    .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
