/*
Problem:
Proper resource management.

Concept:
try-with-resources (Java 7+)

Why?
- Automatically closes resources.
- Prevents memory leaks.
*/

import java.io.*;

class ExcpDemo6 {
    public static void main(String[] args) {

        try (FileReader fr = new FileReader("abc.txt")) {
            System.out.println("Reading file");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
