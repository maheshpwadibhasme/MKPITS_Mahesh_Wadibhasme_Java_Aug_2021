class Employee{
	String empname="rajesh";
}
class PartTimeEmployee extends Employee{
	String empname="vishal";
	void display(){
		System.out.println("Employee Name = "+super.empname);
		System.out.println("Part Time Employee name = "+empname);
	}
}
class TestSuper3{
	public static void main(String[] args){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		PartTimeEmployee p=new PartTimeEmployee();
		p.display();
	}
}