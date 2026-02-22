/*
Day 27 — Exception Handling

Program:
Using finally block

Concept:
finally always executes

Explanation:
- try block contains risky code.
- catch handles exception if occurs.
- finally block executes whether exception occurs or not.
- Commonly used for closing resources (files, DB connections).

Learning Outcome:
Understanding guaranteed execution using finally.
*/

class EXCPDemo3{
	public static void main(String[] args){
		int a = 7;
		int b =0;
		int result =0;
		try{
			result=a/b;
		}catch(Exception e){
			System.out.println("ArithmeticException : "+e.getMessage());
		}finally{
			System.out.println("Always Execute");
		}
	}
}
