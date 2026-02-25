/*
Problem:
Create meaningful business exception.

Concept:
Validation exception.
*/

class ValidationException extends RuntimeException {

    ValidationException(String msg) {
        super(msg);
    }
}

class ExcpDemo5 {

    static void validateEmail(String email) {

        if (!email.contains("@"))
            throw new ValidationException("Invalid email format");

        System.out.println("Valid email");
    }

    public static void main(String[] args) {

        validateEmail("abc.com");
    }
}
