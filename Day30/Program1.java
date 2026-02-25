/*
Problem:
Demonstrate exception chaining using cause.

Concept:
Exception Chaining

Why?
- Preserve original exception
- Helpful in layered applications
*/

class ExcpDemo1 {

    static void lowLevel() {
        throw new ArithmeticException("Division failed");
    }

    static void highLevel() {
        try {
            lowLevel();
        } catch (ArithmeticException e) {

            // Wrap and preserve original cause
            throw new RuntimeException("High level failure", e);
        }
    }

    public static void main(String[] args) {

        try {
            highLevel();
        } catch (RuntimeException e) {

            System.out.println("Message: " + e.getMessage());
            System.out.println("Root Cause: " + e.getCause());
        }
    }
}
