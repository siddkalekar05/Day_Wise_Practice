import java.io.*;
class FileDemo2{
	public static void main(String[] args)throws IOException{
		FileWriter fw = new FileWriter("Sample.txt");
		fw.write("Java File handling Demo");
		fw.close();
	}
}
