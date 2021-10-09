//create a class person , then create  a class employee inherited from person class,
//then create a class parttimeemployee inherited from employee class
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
	int id;
	int salary;

	void insertEmployeeData(int id,int salary){
		this.id=id;
		this.salary=salary;
	}
	void displayEmployeeData(){
		System.out.println("Id ="+id);
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
class TestMultiInheri2{
	public static void main(String[] args){
		PartTimeEmployee p=new PartTimeEmployee();
		p.insertPersonData("Mahesh","Nagpur");
		p.insertEmployeeData(12,50000);
		p.insertPartTimeEmployeeData(2);

		p.displayPersonData();
		p.displayEmployeeData();
		p.displayPartTimeEmployeeData();
	}
}