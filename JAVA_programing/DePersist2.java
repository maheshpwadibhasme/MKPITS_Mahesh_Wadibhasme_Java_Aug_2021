//for deserialization create DePersist2.java
import java.io.*;
public class DePersist2{
	public static void main(String[] args){
		try{
			FileInputStream fin=new FileInputStream("stud.txt");
			ObjectInputStream ois=new ObjectInputStream(fin);

			SerializStudent s1=(SerializStudent)ois.readObject();

			fin.close();
			System.out.println("Student Id:-"+s1.id);
			System.out.println("Student Name:-"+s1.name);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}