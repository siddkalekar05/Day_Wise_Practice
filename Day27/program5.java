/*
Day 27 — Exception Handling

Program:
Using throws keyword

Concept:
Declaring checked exception

Explanation:
- Method readFile() may throw IOException.
- throws keyword informs caller about possible exception.
- Caller must handle using try-catch.

Learning Outcome:
Understanding difference between throw and throws.
*/

import java.io.*;

class EXCPDemo5 {

    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
