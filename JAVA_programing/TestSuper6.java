import java.util.Scanner;
class Person{
	String name;
	String address;
	void getData(String name,String address){
		this.name=name;
		this.address=address;
	}
	void displayData(){
		System.out.println("Name ="+name);
		System.out.println("Address ="+address);
	}
}
class Student extends Person{
	int rno;
	int marks;
	void getData(int rno,int marks,String name,String address){
		getData(name,address);
		this.rno=rno;
		this.marks=marks;
	}
	void displayData(){
		super.displayData();
		System.out.println("Roll No. ="+rno);
		System.out.println("Marks ="+marks);
	}
}
class TestSuper6{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Roll NO.= ");
		int rno=scan.nextInt();

		System.out.println("Enter Name = ");
		String name=scan.next();

		System.out.println("Enter Address = ");
		String address=scan.next();

		System.out.println("Enter Marks = ");
		int marks=scan.nextInt();

		Student s=new Student();
		s.getData(rno,marks,name,address);
		s.displayData();
	}
}