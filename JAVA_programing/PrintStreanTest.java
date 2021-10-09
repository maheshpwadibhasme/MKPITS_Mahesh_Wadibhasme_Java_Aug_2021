//In this example, we are simply printing integer and string value.
import java.io.*;
public class PrintStreanTest{
	public static void main(String[] args){
		try{
			FileOutputStream fout=new FileOutputStream("E:\\java_i_o\\mahesh1.txt");
			PrintStream ps=new PrintStream(fout);
			ps.println(2021);
			ps.println("hello mahesh");
			ps.println("wadibhasme");
			ps.close();
			fout.close();
			System.out.println("Success..");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}