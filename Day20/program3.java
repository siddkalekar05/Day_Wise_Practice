import java.io.*;

class DeserializeExample {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("student.ser"));

        Student s = (Student) in.readObject();
        in.close();

        System.out.println(s.name + " " + s.marks);
    }
}
