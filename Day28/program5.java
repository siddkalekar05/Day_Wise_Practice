/*
Concept:
Multiple catch in single block
*/
class InvalidAmountException extends RuntimeException {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class Example5 {

    static void withdraw(int amount) {
        if (amount > 1000)
            throw new InvalidAmountException("Limit exceeded");

        System.out.println("Withdraw successful");
    }

    public static void main(String[] args) {
        withdraw(2000);
    }
}
