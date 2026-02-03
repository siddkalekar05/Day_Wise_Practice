/*
Problem:
Demonstrate method overloading.

Concept:
Compile-Time Polymorphism

Explanation:
- Same method name
- Different parameter list
- Method call decided at compile time
*/

class MethodOverloadingDemo {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj = new MethodOverloadingDemo();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(2.5, 3.5));
    }
}
