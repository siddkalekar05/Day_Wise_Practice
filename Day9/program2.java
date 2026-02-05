import java.util.*;
class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

        sb.reverse();
        String str2  = new String(sb);

        System.out.println("Reversed String: " + str2);
	if(str.equals(str2)){
		System.out.println("String are pallindrome");
	}else{
		System.out.println("String is not pallindrome ");
	}
    }
}
