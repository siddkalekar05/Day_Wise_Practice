/*
Problem:
Compare abstract class and interface using real-world example.

Concept:
Abstract Class vs Interface

Explanation:
- Abstract class: IS-A relationship with shared behavior.
- Interface: CAN-DO relationship.
*/

abstract class Payment {
    abstract void pay();

    void receipt() {
        System.out.println("Payment receipt generated");
    }
}

interface Refundable {
    void refund();
}

class UPI extends Payment implements Refundable {
    void pay() {
        System.out.println("Payment done via UPI");
    }

    public void refund() {
        System.out.println("Refund processed");
    }

    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();
        p.receipt();

        Refundable r = new UPI();
        r.refund();
    }
}
