/*
Problem:
Reverse a given string using StringBuffer.

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
