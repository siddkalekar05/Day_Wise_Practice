class Parent4 {
    int x = 10;

    void display() {
        System.out.println("Parent display method");
    }
}

class Child4 extends Parent4 {
    int x = 20;

    void show() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
        super.display();
    }

    public static void main(String[] args) {
        Child4 c = new Child4();
        c.show();
    }
}
