/*
Problem:
Achieve multiple inheritance using interface.

Concept:
Multiple inheritance via interface

Explanation:
- Java does not support multiple inheritance using classes.
- Achieved using interfaces.
*/

interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOneMachine implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }

    public static void main(String[] args) {
        AllInOneMachine m = new AllInOneMachine();
        m.print();
        m.scan();
    }
}
