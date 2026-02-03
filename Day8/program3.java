/*
Problem:
Demonstrate parent reference holding child object.

Concept:
Runtime Polymorphism

Explanation:
- Reference type decides accessible methods
- Object type decides which method executes
*/

class BMW {
    void info() {
        System.out.println("Main Company");
    }
}

class M5 extends BMW {
    @Override
    void info() {
        System.out.println("BMW M5 MODEL");
    }
}

class ParentReferenceDemo1 {
    public static void main(String[] args) {
        BMW b = new M5();
        b.info(); // M5 info  method
    }
}
