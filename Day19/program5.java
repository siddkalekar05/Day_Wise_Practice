/*
Concept:
Writing file using PrintWriter.
*/

import java.io.*;
class FileDemo5{
	public static void main(String[] args)throws IOException{
		PrintWriter pw = new PrintWriter("Sample.txt");
		pw.write("Line 1");
		pw.write("Line2");
		pw.close();
	}
}
