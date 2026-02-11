import java.util.*;
class StackDemo2{
	public static void main(String[] args){
		Stack<String> s = new Stack<>();
		s.push("Sk");
		s.push("DS");
		s.push("SSK");
		s.push("MK");
		System.out.println(s);
		System.out.println("Top : "+s.peek());
		System.out.println("Remove : "+s.pop());
		System.out.println(s);
	}
}
