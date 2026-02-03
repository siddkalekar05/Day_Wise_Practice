class Parent {
    void show() {
        System.out.println("Parent show method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show method");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show();  // runtime decision
    }
}
