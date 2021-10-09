//another example of single inhertance
//create  a class person and then create a child class employee
class Person{
	String name;
	String address;
	void insertPersonData(String name,String address){
		this.name=name;
		this.address=address;
	}
	void displayPersonData(){
		System.out.println("Nahe ="+name);
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
class TestSingInherit3{
	public static void main(String[] args){
		Employee e=new Employee();
		e.insertPersonData("mahesh","Nagpur");
		e.insertEmployeeData(1002,500000);
		e.displayPersonData();
		e.displayEmployeeData();
		}
}