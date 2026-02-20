/*
Concept:
Finding elements in stream
*/
import java.util.*;
class StreamDemo6{
	public static void main(String[] args){
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(3);
		l.add(5);
		l.add(2);
		l.add(2);
		System.out.println(l);
		l.stream().distinct().sorted().forEach(System.out::println);
	}
}

