/*
Day 27 — Exception Handling

Program:
Creating and using custom exception

Concept:
User-defined exception (Checked Exception)

Explanation:
- InvalidAgeException extends Exception.
- Custom exception represents business rule violation.
- throw is used to create exception object.
- throws declares method may throw exception.
- catch handles custom exception.

Learning Outcome:
Understanding creation and usage of custom exceptions.
*/

import java.util.*;

class Invalid extends Exception{
	Invalid(String msg){
		super(msg);
	}
}
class EXCPDemo6{
	static void elgible(int a)throws Invalid{
		int age = a;
		if(age<18){
			throw new Invalid("Invalid age");
		}else{
			System.out.println("Eligible");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		int a = sc.nextInt();
		try{
			elgible(a);
		}catch(Invalid e){
			System.out.println(e.getMessage());
		}
	}
}

