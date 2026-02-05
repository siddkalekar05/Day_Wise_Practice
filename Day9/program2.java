/*
Problem:
Reverse a given string using StringBuffer.
and check the given string is pallindrome or not 

Concept:
String manipulation using StringBuffer

Explanation:
- StringBuffer is mutable.
- reverse() method is synchronized (thread-safe).
- Suitable for multi-threaded environments.

Why StringBuffer:
- String is immutable.
- StringBuilder is not thread-safe.
- StringBuffer provides thread safety.
	*/

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
