//Java Serialization with Inheritance (IS-A Relationship)
//If a class implements Serializable interface then all its sub classes will also be serializable.
//Let's see the example given below:

import java.io.*;
class Person implements Serializable{
	int id;
	String name;

	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
}
class Student extends Person{
	String course;
	int fee;

	Student(int id, String name, String course, int fee){
		super(id,name);
		this.course=course;
		this.fee=fee;
	}
}
class SerializeISA{
	public static void main(String[] args){
		try{
			Student s1=new Student(121,"mahesh","Engineering",50000);

			FileOutputStream fos=new FileOutputStream("ISA.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			oos.writeObject(s1);
			oos.flush();
			oos.close();

			System.out.println("Success...");
		}
		catch(Exception e){
			System.out.println(e);
		}
		try{

			FileInputStream fin=new FileInputStream("ISA.txt");
			ObjectInputStream ois=new ObjectInputStream(fin);

			Student s=(Student)ois.readObject();
			System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
			ois.close();
		}
		catch(Exception e){
				System.out.println(e);
		}
	}
}
