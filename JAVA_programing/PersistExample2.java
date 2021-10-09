//example for accepting student details from user using Scanner class.
import java.io.*;
import java.util.*;

class Student implements Serializable{
	int id;
	String name;
	transient int age;

	public Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
class PersistExample2{
	public static void main(String[] args)throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student ID:-");
		int id=scan.nextInt();
		System.out.println("Enter student Name:-");
		String name=scan.next();
		System.out.println("Enter Student age:-");
		int age=scan.nextInt();

		Student s1=new Student(id,name,age);
		FileOutputStream fos=new FileOutputStream("STUD2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("success..");

		FileInputStream fis=new FileInputStream("STUD2.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s11=(Student)ois.readObject();
		ois.close();
		System.out.println("Student Id:- "+s11.id);
		System.out.println("Student name:- "+s11.name);
		System.out.println("Student age:- "+s11.age);
	}
}