//In this example, we have created two classes Student and PersistExample. The age data member of
//the Student class is declared as transient, its value will not be serialized.

import java.io.*;
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
class PersistExample{
	public static void main(String[] args){
		try{
			Student s1=new Student(12,"mahesh",22);

			FileOutputStream fos=new FileOutputStream("STUD1.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			oos.writeObject(s1);
			oos.flush();
			oos.close();
			fos.close();

			System.out.println("Success..");
		}
		catch(Exception e){
			System.out.println(e);
		}

		try{
			FileInputStream fis=new FileInputStream("STUD1.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Student s1=(Student)ois.readObject();
			ois.close();
			System.out.println(s1.id+" "+s1.name+" "+s1.age);

		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}