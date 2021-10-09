//In this example, we are writing the data in the file testout.txt using Java FileWriter class.
import java.io.*;
public class FileWriterExample{
	public static void main(String[] args){
		try{
			FileWriter fw=new FileWriter("e:\\testout.txt");
			fw.write("welcome to home alone.");
			fw.close();

		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("success..");
	}
}