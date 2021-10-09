//Example of Java InputStreamReader
import java.io.*;
public class InputStreamReader1{
	public static void main(String[] args){
		try{
			InputStream is=new FileInputStream("e:\\java_i_o\\mahesh1.txt");
			Reader r=new InputStreamReader(is);
			int data=r.read();
			while(data!=-1){
				System.out.print((char)data);
				data=r.read();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}