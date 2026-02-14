import java.io.*;
class FileDemo4{
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("Sample.txt"));

				String line ;
				while((line=br.readLine())!=null){
					System.out.println(line);
				}
				br.close();
	}
}
