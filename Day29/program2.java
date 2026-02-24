/*
Problem:
Avoid catching generic Exception class.

Concept:
Catch specific exceptions for better debugging and clarity.

Why?
- Catching Exception hides real issue.
- Specific catch improves readability and maintenance.
*/
class ExcpDemo1Correct {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
