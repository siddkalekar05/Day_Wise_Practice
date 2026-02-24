/*
Problem:
Wrap lower-level exception into custom exception.

Concept:
Exception wrapping (Layered architecture).

Why?
- Hide internal implementation details.
- Preserve original cause using super(message, cause).
*/

class ExcpDemo2 {

    static void process() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Logging error...");
            throw e; // rethrow
        }
    }

    public static void main(String[] args) {
        try {
            process();
        } catch (Exception e) {
            System.out.println("Handled in main");
        }
    }
}
