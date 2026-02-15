import java.io.*;

class SerializeExample {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Sidd", 90);

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("student.ser"));

        out.writeObject(s);
        out.close();

        System.out.println("Object serialized");
    }
}
