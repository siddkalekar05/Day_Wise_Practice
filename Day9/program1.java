import java.util.*;
class ReverseString {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String : ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);

	sb.reverse();
	String str2  = new String(sb);

        System.out.println("Reversed String: " + str2);
    }
}
