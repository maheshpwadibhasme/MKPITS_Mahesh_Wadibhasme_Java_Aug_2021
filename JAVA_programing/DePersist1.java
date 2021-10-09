//for deserialization create DePersist1.java
import java.io.*;

public class DePersist1{
	public static void main(String[] args){
		try{
			FileInputStream fin=new FileInputStream("e://java_i_o//cust.txt");
			ObjectInputStream ois=new ObjectInputStream(fin);

			Customer c1=(Customer)ois.readObject();
			fin.close();

			System.out.println("Customer name:-"+c1.name);
			System.out.println("Customer email:-"+c1.email);

		}catch(Exception e){
			System.out.println(e);
		}

	}
}