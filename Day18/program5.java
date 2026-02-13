import java.util.*;

class IteratorDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list, (a, b) -> b - a);

        System.out.println(list);
    }
}
