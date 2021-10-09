//for serialization create Persist1.java

import java.io.*;
public class Persist2{
	public static void main(String[] args){
		try{
			SerializStudent s1=new SerializStudent(121,"mahesh");

			FileOutputStream fos=new FileOutputStream("stud.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			oos.writeObject(s1);

			oos.flush();
			fos.close();

			System.out.println("Success..");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}