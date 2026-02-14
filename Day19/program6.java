/*
Concept:
Simple log writer using FileWriter.
*/
import java.io.*;
class FileDemo6 {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("log.txt", true);

        fw.write("Application started\n");
        fw.close();
    }
}
