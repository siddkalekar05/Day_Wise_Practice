/*
Problem:
Show benefit of polymorphism.

Concept:
Code flexibility and scalability

Explanation:
- Same interface, multiple behaviors
- Easy to extend without modifying existing code
*/

class Payment {
    void pay() {
        System.out.println("Payment processing");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("Payment via UPI");
    }
}

class Card extends Payment {
    void pay() {
        System.out.println("Payment via Card");
    }
}

class PolymorphismBenefit {
    public static void main(String[] args) {
        

        Payment p = new UPI();
        p.pay();

        Payment p1 = new Card();
        p1.pay();
    }
}
