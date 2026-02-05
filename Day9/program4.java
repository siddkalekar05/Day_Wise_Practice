/*
Problem:
Demonstrate difference between String and StringBuilder.

Concept:
String immutability

Explanation:
- String creates new object on modification
- StringBuilder modifies same object
*/

class StringBuilderDemo {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");
        System.out.println("String result: " + s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder result: " + sb);
    }
}
