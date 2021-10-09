//In this example, we are reading the data from the text file testout.txt using Java FileReader class.

import java.io.*;
public class FileReaderExample{
	public static void main(String[] args)throws Exception{
		FileReader fr=new FileReader("e:\\testout.txt");
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		fr.close();
	}
}