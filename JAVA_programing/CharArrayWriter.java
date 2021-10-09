//Example of CharArrayWriter Class:
//In this example, we are writing a common data to 4 files a.txt, b.txt, c.txt and d.txt.
import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriter1{
	public static void main(String[] args){
		try{
			CharArrayWriter caw=new CharArrayWriter();
			caw.write("mahesh wadibhasme");

			FileWriter f1=new FileWriter("e:\\java_i_o\\f1.txt");
			FileWriter f2=new FileWriter("e:\\java_i_o\\f2.txt");
			FileWriter f3=new FileWriter("e:\\java_i_o\\f3.txt");
			FileWriter f4=new FileWriter("e:\\java_i_o\\f4.txt");

			caw.writeTo(f1);
			caw.writeTo(f2);
			caw.writeTo(f3);
			caw.writeTo(f4);

			f1.close();
			f2.close();
			f3.close();
			f4.close();
			System.out.println("Success..");

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}