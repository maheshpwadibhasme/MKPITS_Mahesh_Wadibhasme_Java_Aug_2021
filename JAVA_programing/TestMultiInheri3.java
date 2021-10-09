//create a class person , then create  a class employee inherited from person class,
//then create a class parttimeemployee inherited from employee class
//repeat the above program by accepting values from the user
class Person{
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
class Employee extends Person{
	int empid;
	int salary;
	void insertEmployeeData(int empid,int salary){
		this.empid=empid;
		this.salary=salary;
	}
	void displayEmployeeData(){
		System.out.println("ID ="+empid);
		System.out.println("Salary ="+salary);
	}
}
class PartTimeEmployee extends Employee{
	int hours;
	void insertPartTimeEmployeeData(int hours){
		this.hours=hours;
	}
	void displayPartTimeEmployeeData(){
		System.out.println("Hours ="+hours);
	}
}
class TestMultiInheri3{
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);
	PartTimeEmployee p1=new PartTimeEmployee();

		System.out.println("Enter Name =");
		String name=scan.next();

		System.out.println("Enter Address =");
		String address=scan.next();
		p1.insertPersonData(name,address);

		System.out.println("Enter Id =");
		int empid=scan.nextInt();

		System.out.println("Enter Salary =");
		int salary=scan.nextInt();
		p1.insertEmployeeData(empid,salary);

		System.out.println("Emter Working Hours =");
		int hours=scan.nextInt();
		p1.insertPartTimeEmployeeData(hours);

		p1.displayPersonData();
		p1.displayEmployeeData();
		p1.displayPartTimeEmployeeData();
	}
}