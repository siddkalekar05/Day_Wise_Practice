/*
Concept:
Reading file using FileReader.
*/

import java.io.*;
class FileDemo3{
	public static void main(String[] args)throws IOException{
		FileReader fr = new FileReader("Sample.txt");
		int ch;
		while((ch=fr.read())!=-1){
			System.out.print((char)ch);
		}
		System.out.println();
		fr.close();
	}
}
