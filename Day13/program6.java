/*
Day 13 — Java Keywords

Program:
final method example

Concept:
A final method cannot be overridden.
*/

class PaymentGateway {
    final void transactionID() {
        System.out.println("Transaction ID generated");
    }
}

class OnlineGateway extends PaymentGateway {
    //  This would cause compile error
    // void transactionID() { }
    
    void process() {
        System.out.println("Processing payment...");
    }
}

class DemoFinalMethod {
    public static void main(String[] args) {
        OnlineGateway g = new OnlineGateway();
        g.transactionID();
        g.process();
    }
}

