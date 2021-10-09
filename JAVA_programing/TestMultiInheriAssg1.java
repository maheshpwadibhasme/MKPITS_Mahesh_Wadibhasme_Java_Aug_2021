//create a person class , then create a student class inherited from person class , 
//then create a parttimestudent class inherited from student class.
class Person {
	String name;
	String address;
	void insertPersonData(String name,String address){
		this.name=name;
		this.address=address;
	}
	void displayPersonData(){
		System.out.println("Name ="+name);
		System.out.println("Address ="+address);
	}
}
class Student extends Person{
	int rno;
	int marks;
	void insertStudentData(int rno,int marks){
		this.rno=rno;
		this.marks=marks;
	}
	void displayStudentData(){
		System.out.println("Roll No. ="+rno);
		System.out.println("Marks ="+marks);
	}
}
class PartTimeStudent extends Student{
	int hours;
	void insertPartTimeStudentData(int hours){
		this.hours=hours;
	}
	void displayPartTimeStudentData(){
		System.out.println("Hours ="+hours);
	}
}
class TestMultiInheriAssg1{
	public static void main(String[] args){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		PartTimeStudent p1=new PartTimeStudent();
		
		System.out.println("Enter Name =");
		String name=scan.next();
		System.out.println("Enter Address =");
		String address=scan.next();
		p1.insertPersonData(name,address);
		
		System.out.println("Enter Roll No.= ");
		int rno=scan.nextInt();
		System.out.println("Enter Marks =");
		int marks=scan.nextInt();
		p1.insertStudentData(rno,marks);
		
		System.out.println("Enter working hours =");
		int hours=scan.nextInt();
		p1.insertPartTimeStudentData(hours);
		
		p1.displayPersonData();
		p1.displayStudentData();
		p1.displayPartTimeStudentData();
	}
}