/*
Scenario:
Validating online payment amount before processing.

Concept:
Exception handling using function arguments.

Explanation:
- Method receives payment amount.
- Throws exception if amount is invalid.
*/

class OnlinePaymentValidation {

    static void processPayment(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid payment amount!");
        }
        System.out.println("Payment processed: ₹" + amount);
    }

    public static void main(String[] args) {
        try {
            processPayment(-500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

