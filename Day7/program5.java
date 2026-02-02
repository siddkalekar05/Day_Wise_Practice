/*
Problem:
Show constructor calling order in inheritance.
    */

class Parent5 {
    Parent5() {
        System.out.println("Parent constructor");
    }
}

class Child5 extends Parent5 {
    Child5() {
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        Child5 c = new Child5();
    }
}
