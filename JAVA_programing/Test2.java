//Example of parameterized constructor
class Employee{
	int empno;
	String empname;

	public Employee(){
		System.out.println("Default constructor");
		empno=123;
		empname="mahesh";
	}

	public Employee(int e,String n){
		System.out.println("parameterized constructor");
		empno=e;
		empname=n;
	}

	void display(){
		System.out.println("Employee no. ="+empno);
		System.out.println("Empoyee name ="+empname);
	}
}
class Test2{
	public static void main(String[] args){
		Employee emp=new Employee();
		emp.display();
		Employee emp1=new Employee(254,"raju");
		emp1.display();
	}
}