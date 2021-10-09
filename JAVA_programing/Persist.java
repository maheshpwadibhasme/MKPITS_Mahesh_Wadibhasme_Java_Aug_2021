//for serialization create Persist.java

import java.io.*;
public class Persist{
	public static void main(String[] args){
		try{
			Customer c1=new Customer("mahesh","m@gmail.com");
			FileOutputStream fos=new FileOutputStream("e://java_i_o//cust.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.flush();
			fos.close();
			System.out.println("Success..");
		}
		catch(Exception ee){
			System.out.println(ee.toString());
		}
	}
}
