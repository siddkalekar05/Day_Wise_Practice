/*
Problem:
Demonstrate polymorphism using real-world example.

Concept:
Runtime Polymorphism

Explanation:

- Same method name (area)
- Different implementations
- Behavior depends on object type
*/

class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of circle");
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of rectangle");
    }
}

class ShapePolymorphism {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}
