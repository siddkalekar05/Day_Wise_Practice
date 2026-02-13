/*
Concept:
Comparator for custom sorting.
*/

import java.util.*;
class Employee {
    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "" + salary;
    }
}

class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.salary - e2.salary;
    }
}

class IteratorDemo4 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(40000));
        list.add(new Employee(20000));
        list.add(new Employee(60000));

        Collections.sort(list, new SalaryComparator());
        System.out.println(list);
    }
}

