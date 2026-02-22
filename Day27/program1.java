import java.util.*;
class EXCPDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 st no : ");
		int a = sc.nextInt();
		System.out.println("Enter 2 nd no : ");
		int b = sc.nextInt();
		int result =0;
		try{
			 result = a/b;
		}catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		System.out.println("Result : "+result);
	}
}
		
