//Java ByteArrayOutputStream Class

import java.io.*;
public class ByteArrayOutputStream1{
	public static void main(String[] args){
		try{
			FileOutputStream fout1=new FileOutputStream("e:\\a.txt");
			FileOutputStream fout2=new FileOutputStream("e:\\b.txt");

			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			bout.write(65);
			bout.writeTo(fout1);
			bout.writeTo(fout2);
			bout.flush();
			System.out.println("Success...");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}