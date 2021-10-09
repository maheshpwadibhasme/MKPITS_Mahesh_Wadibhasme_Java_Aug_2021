//create a parent class person having common fields name,address and methods
//create a child class student inherited from person class having additional fields rno, marks and methods
//create a child class employee inherited from person class having additional fields empno, salary and methods.
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
		System.out.println("Roll No.="+rno);
		System.out.println("Marks ="+marks);
	}
}
class Employee extends Person{
	int empno;
	int salary;
	void insertEmployeeData(int empno,int salary){
		this.empno=empno;
		this.salary=salary;
	}
	void displayEmployeeData(){
		System.out.println("Employee No.="+empno);
		System.out.println("Employee Salary ="+salary);
	}
}
class TestHierachiInheri2{
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("----------Enter Student details are----------");
	Student s1=new Student();

	System.out.print("Enter Student Name =");
	String name=scan.next();
	System.out.print("Enter Student Address =");
	String address=scan.next();
	s1.insertPersonData(name,address);

	System.out.print("Enter Student Roll No. =");
	int rno=scan.nextInt();
	System.out.print("Enter Student Marks =");
	int marks=scan.nextInt();
	s1.insertStudentData(rno,marks);

	System.out.println("----------------Student details are-------------");
	s1.displayPersonData();
	s1.displayStudentData();

	System.out.println("----------Enter Employee details are-----------");
	Employee e1=new Employee();

	System.out.print("Enter Employee Name =");
	 name=scan.next();
	System.out.print("Enter Employee Address =");
	 address=scan.next();
	e1.insertPersonData(name,address);

	System.out.print("Enter Employee No. =");
	int empno=scan.nextInt();
	System.out.print("Enter Employee Salary =");
	int salary=scan.nextInt();
	e1.insertEmployeeData(empno,salary);

	System.out.println("----------------Employee details are-------------");
	e1.displayPersonData();
	e1.displayEmployeeData();


	}
}
