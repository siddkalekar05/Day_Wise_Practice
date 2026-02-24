/*
Problem:
Wrap lower-level exception into custom exception.

Concept:
Exception wrapping (Layered architecture).

Why?
- Hide internal implementation details.
- Preserve original cause using super(message, cause).
*/

class ExcpDemo5{

    static void serviceLayer() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        serviceLayer();
    }
}
