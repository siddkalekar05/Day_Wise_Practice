/*
Concept:
Static method in interface
*/

interface Calculator {
    static void info() {
        System.out.println("Calculator interface");
    }
}

class Demo {
    public static void main(String[] args) {
        Calculator.info();
    }
}
