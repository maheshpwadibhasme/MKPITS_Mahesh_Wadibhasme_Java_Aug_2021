//Java FilterOutputStream Class
import java.io.*;
public class FilterOutputStream1{
	public static void main(String[] args){
		try{
			File data=new File("e:\\testout.txt");
			FileOutputStream fin=new FileOutputStream(data);
			FilterOutputStream fout= new FilterOutputStream(fin);

			String str="Welcome to home";
			byte b[]=str.getBytes();

			fout.write(b);
			fout.flush();
			fout.close();
			fin.close();

			System.out.println("Success..");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}