/*
Concept:
Remove duplicates using distinct()
*/
import java.util.*;
class StreamDemo1{
	public static void main(String[] args){
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		System.out.println(l);
		l.stream().forEach(System.out::println);
	}
}
