/*
Day 27 — Exception Handling

Program:
Using throw keyword

Concept:
Manually throwing exception

Explanation:
- throw is used to explicitly create and throw an exception.
- If condition fails (age < 18), program throws exception.
- If not caught, program terminates with stack trace.

Learning Outcome:
Understanding manual exception generation using throw.
*/

import java.util.*;
class EXCPDemo4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		try{	
			if(age>=18){
			System.out.println("Eligible");
			}else{
				throw new ArithmeticException("Not eligible");
		}
	}catch(ArithmeticException a){
		System.out.println(a.getMessage());
	}
	}
}
