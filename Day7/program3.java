/*
Problem:
Demonstrate method overriding.
    */

class Parent2 {
    void show() {
        System.out.println("Parent show method");
    }
}

class Child3 extends Parent2 {
    @Override
    void show() {
        System.out.println("Child show method");
    }

    public static void main(String[] args) {
        Parent2 p = new Child3();
        p.show();  // calls Child's method
    }
}
