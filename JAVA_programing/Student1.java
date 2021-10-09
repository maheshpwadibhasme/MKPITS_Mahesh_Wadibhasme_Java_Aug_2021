import java.io.*;

class Address implements Serializable{
	String addressline,city,state;

	public Address(String addressline,String city,String state){
		this.addressline=addressline;
		this.city=city;
		this.state=state;
	}
}
public class Student1 implements Serializable{
	int id;
	String name;
	Address address;

	public Student1(int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}

	public static void main(String[] args){
		try{
			Address addr=new Address("Ramtek","nagpur","Maharastra");
			Student1 s1=new Student1(123,"mahesh",addr);

			FileOutputStream fos=new FileOutputStream("HAS.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);

			oos.writeObject(s1);
			oos.flush();
			fos.close();

			System.out.println("Success...");
		}
		catch(Exception e){
			System.out.println(e);
		}

		try{
			FileInputStream fis=new FileInputStream("HAS.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);

			Student1 s1=(Student1)ois.readObject();
			fis.close();

			System.out.println("Student ID:- "+s1.id);
			System.out.println("Student Name:- "+s1.name);
			System.out.println("Student Address:- "+s1.address.addressline);
			System.out.println("Student City:- "+s1.address.city);
			System.out.println("Student State:- "+s1.address.state);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}