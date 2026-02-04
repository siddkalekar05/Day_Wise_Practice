/*
Problem:
Demonstrate interface in Java.

Concept:
Interface

Explanation:
- Interface contains abstract methods by default.
- Used to achieve 100% abstraction.
*/

interface College {
    void student();
}

class Department implements College {
    public void student() {
        System.out.println("Take an addmission");
    }

    public static void main(String[] args) {
        College c = new Department();
        c.student();
    }
}
