interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class InterfacePolymorphism {
    public static void main(String[] args) {
        Animal a;

        a = new Cat();
        a.sound();

        a = new Dog();
        a.sound();
    }
}
