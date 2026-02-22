/*
Day 27 — Exception Handling

Program:
Multiple catch blocks

Concept:
Handling different exception types separately

Explanation:
- try block may throw different exceptions.
- Each catch handles specific exception.
- More specific exception must come before general Exception.

Learning Outcome:
Understanding exception hierarchy and multiple catch handling.
*/

class EXCPDemo2{
	public static void main(String[] args){
		String s = null;
		try{
			System.out.println(s.length());
		}catch(NullPointerException n){
			System.out.println("Null Pointer Exception "+n.getMessage());
		}catch(Exception e){
			System.out.println("Genaral Exception");
		}
	}
}
