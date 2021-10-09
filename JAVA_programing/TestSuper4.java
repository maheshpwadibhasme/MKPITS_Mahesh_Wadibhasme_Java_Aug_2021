class Employee{
	String empname="Rahul";
		void display(){
			System.out.println(" Employee Name = "+empname);
		}
}
class PartTimeEmployee extends Employee{
	String empname="Mahesh";
		void display(){
			super.display();
			System.out.println("Part Time Employee Name = "+empname);
		}
}
class TestSuper4{
	public static void main(String[] args){
		PartTimeEmployee p=new PartTimeEmployee();
		p.display();
	}
}