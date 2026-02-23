/*
Concept:
Difference between Checked and Unchecked Exception
*/

import java.io.*;

class ExcpDemo1 {

    // Checked Exception (must handle)
    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Checked Exception handled");
        }

        // Unchecked Exception
        int a = 10 / 0; // ArithmeticException (Runtime)
    }
}
