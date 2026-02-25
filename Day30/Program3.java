/*
Problem:
Understand rules of overriding with exceptions.

Concept:
Exception in method overriding.

Rule:
- Child class cannot throw broader checked exception.
*/

class Parent {
    void display() throws Exception {
        System.out.println("Parent method");
    }
}

class Child extends Parent {

    // Allowed: same or narrower exception
    void display() throws ArithmeticException {
        System.out.println("Child method");
    }
}

class ExcpDemo3 {
    public static void main(String[] args) throws Exception {

        Parent obj = new Child();
        obj.display();
    }
}
