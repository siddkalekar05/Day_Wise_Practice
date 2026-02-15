import java.io.Serializable;

class Student implements Serializable {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
