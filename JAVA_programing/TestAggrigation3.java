//In this example, Employee has an object of Address, address object contains its own informations
//such as city, state, country etc. In such case relationship is Employee HAS-A address.
//repeat the above program by accepting values from the user.
//import java.util.Scanner;
class Address{
	String city,state,country;

	public Address(String city,String state,String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
 class Employee{
	int empid;
	String empname;
	Address add;
	public Employee(int empid,String empname,Address add){
		this.empid=empid;
		this.empname=empname;
		this.add=add;
	}
	void display(){
			System.out.println("Employee Id ="+empid);
			System.out.println("Employee name ="+empname);
			System.out.println("Employee city ="+add.city);
			System.out.println("Employee State ="+add.state);
			System.out.println("Employee Country ="+add.country);
	}
}
class TestAggrigation3{
	public static void main(String[] args){
    java.util.Scanner scan=new java.util.Scanner(System.in);
		//Scanner scan=new Scanner(System.in);

		System.out.println("Enter Employee Id =");
		int empid=scan.nextInt();

		System.out.println("Enter Employee Name =");
		String empname=scan.next();

		System.out.println("Enter Employee city =");
		String city=scan.next();

		System.out.println("Enter Employee state =");
		String state=scan.next();

		System.out.println("Enter Employee country =");
		String country=scan.next();

		Address add=new Address(city,state,country);
		Employee e=new Employee(empid,empname,add);
		e.display();

	}
}