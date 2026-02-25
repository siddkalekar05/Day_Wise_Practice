/*
Problem:
Difference between checked and unchecked custom exception.

Concept:
Exception type selection.
*/

class CheckedExceptionExample extends Exception {
    CheckedExceptionExample(String msg) {
        super(msg);
    }
}

class UncheckedExceptionExample extends RuntimeException {
    UncheckedExceptionExample(String msg) {
        super(msg);
    }
}

class ExcpDemo2 {

    static void checkAge(int age) throws CheckedExceptionExample {
        if (age < 18)
            throw new CheckedExceptionExample("Age below 18");
    }

    static void validateAmount(int amount) {
        if (amount > 1000)
            throw new UncheckedExceptionExample("Amount exceeded");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        } catch (CheckedExceptionExample e) {
            System.out.println(e.getMessage());
        }

        validateAmount(2000); // No forced handling
    }
}
