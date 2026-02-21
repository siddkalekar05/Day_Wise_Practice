import java.util.*;
class StreamDemo2{
	public static void main(String[] args){
		List<Integer> l = Arrays.asList(1,23,45,6,8);
		int max = l.stream().reduce( Integer.MIN_VALUE , Integer::max);
		System.out.println(max);
	}
}
