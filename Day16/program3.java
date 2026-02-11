/*
Concept:
Stack follows LIFO (Last In First Out).
*/

import java.util.*;
class StackDemo1{
	public static void main(String[] args){
		Stack<Integer> s = new Stack<>();
		s.push(5);
		s.push(10);
		s.push(15);
		s.push(20);
		System.out.println(s);
	}
}
