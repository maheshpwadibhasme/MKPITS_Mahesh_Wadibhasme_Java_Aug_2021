//Java DataOutputStream Class
import java.io.*;
public class DataOutputStream1{
	public static void main(String[] args){
		try{
			FileOutputStream fout=new FileOutputStream("e:\\testout.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.write(65);
			dout.flush();
			dout.close();
			System.out.println("Success..");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}