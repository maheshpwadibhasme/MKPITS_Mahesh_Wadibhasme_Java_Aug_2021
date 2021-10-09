//In this example, we are writing the textual information in the BufferedOutputStream object
//which is connected to the FileOutputStream object. The flush() flushes the data of one stream and send
//it into another. It is required if you have connected the one stream with another.

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutputStreamExample1{
	public static void main(String[] args)throws Exception{

		FileOutputStream fout= new FileOutputStream("e:\\testout.txt");

		BufferedOutputStream bout=new BufferedOutputStream(fout);

		String s = "mahesh wadibhasme";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");
	}
}

