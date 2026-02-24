/*
Problem:
Wrap lower-level exception into custom exception.

Concept:
Exception wrapping (Layered architecture).

Why?
- Hide internal implementation details.
- Preserve original cause using super(message, cause).
*/

class ServiceException extends RuntimeException {
    ServiceException(String msg, Throwable cause) {
        super(msg, cause);
    }
}

class ExcpDemo3 {

    static void serviceLayer() {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            throw new ServiceException("Service failed", e);
        }
    }

    public static void main(String[] args) {
        serviceLayer();
    }
}
