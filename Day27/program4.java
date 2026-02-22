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
