import java.util.*;
class Person{
	String name;
	String address;
	Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	void display(){
		System.out.println("Name ="+name);
		System.out.println("Address ="+address);
	}
}
class Student extends Person{
	int rno;
	int marks;
	Student(int rno,int marks,String name,String address){
		super(name,address);
		this.rno=rno;
		this.marks=marks;
	}
	void display(){
		super.display();
		System.out.println("Roll No.= "+rno);
		System.out.println("Marks = "+marks);
	}
}
class TestSuper8{
	public static void  main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student roll no = ");
		int rno=scan.nextInt();
		System.out.println("Enter Student name = ");
		String name=scan.next();
		System.out.println("Enter Student address = ");
		String address=scan.next();
		System.out.println("Enter Student marks = ");
		int marks=scan.nextInt();
		Student s=new Student(rno,marks,name,address);
		s.display();
	}
}