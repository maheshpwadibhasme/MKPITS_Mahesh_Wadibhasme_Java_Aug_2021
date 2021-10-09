//Let's see the simple example of writing the data on a console and in a text file testout.txt
//using Java PrintWriter class.
import java.io.*;
public class PrintWriterExample{
	public static void main(String[] args){
		try{
				//Data to write on Console using PrintWriter
			PrintWriter pw=new PrintWriter(System.out);
			pw.write("mkpits provides tutorials of all technology.");
			pw.flush();
			pw.close();

			    //Data to write in File using PrintWriter
			PrintWriter pw1=null;
			pw1=new PrintWriter(new File("e://java_i_o//mahesh1.txt"));
			pw1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
			pw1.flush();
			pw1.close();


		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}