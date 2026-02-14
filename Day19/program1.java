/*
Day 19 — File Handling

Concept:
Creating a file using File class.
*/

import java.io.*;
class FileDemo1{
	public static void main(String[] args)throws IOException{
		File f = new File("Sample.txt");

		if(f.createNewFile()){
			System.out.println("File created");
		}else{
			System.out.println("File Already Exist");
		}
	}
}
