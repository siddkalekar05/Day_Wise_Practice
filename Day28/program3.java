/*
Concept:
Auto-closing resources (Java 7+)
*/
import java.io.*;

class ExcpDemo3 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("abc.txt")) {
            System.out.println("File opened");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
