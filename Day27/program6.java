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

