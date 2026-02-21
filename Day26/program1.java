import java.util.*;
class StreamDemo1{
	public static void main(String[] args){
		List<Integer> l = Arrays.asList(10,20,30,40,50);
		int sum = l.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
	}
}
