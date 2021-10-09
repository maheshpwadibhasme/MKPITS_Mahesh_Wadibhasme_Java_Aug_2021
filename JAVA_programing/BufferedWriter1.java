//Java BufferedWriter Class

import java.io.*;
public class BufferedWriter1{
	public static void main(String[] args){
		try{
			FileWriter writer=new FileWriter("e:\\a.txt");
			BufferedWriter buffer=new BufferedWriter(writer);

			buffer.write("mahesh wadibhasme..");
			buffer.close();

			System.out.println("Success..");
		}
		catch(Exception e){
			System.out.println(e);
		}

	}
}