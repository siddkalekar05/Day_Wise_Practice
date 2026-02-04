/*
Problem:
Demonstrate abstraction using an abstract class.

Concept:
Abstract Class

Explanation:
- Abstract class can have abstract and non-abstract methods.
- Object of abstract class cannot be created.
- Used to hide implementation details.

OOP Concept:
Abstraction
*/

abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Vehicle needs fuel");
    }
}

class Bike extends Vehicle {
 
    void start() {
        System.out.println("Bike starts with kick");
    }

    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuel();
    }
}
