abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area = length * breadth");
    }

    void perimeter() {
        System.out.println("Perimeter = 2 * (l + b)");
    }

    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.area();
        s.perimeter();
    }
}
